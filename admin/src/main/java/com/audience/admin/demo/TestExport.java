package com.audience.admin.demo;

import com.audience.admin.excel.core.ExcelUtils;
import com.audience.admin.excel.core.IExcelUtil;
import com.audience.admin.model.devops.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExport {

    public static void main(String[] args) {
        List<PjExportReceiveArray> list = new ArrayList<>();
        PjExportReceiveArray pjExportReceiveArray = new PjExportReceiveArray();
        pjExportReceiveArray.setId("1");
        pjExportReceiveArray.setName("test-comn");
        pjExportReceiveArray.setEngineUrl("svn://192.168.1.36/test-comn,svn://192.168.1.36/iiiooo,svn://192.168.1.36/ww,svn://192.168.1.36/ww");
        pjExportReceiveArray.setType("Subversion");
        pjExportReceiveArray.setBusinessSystemName("aaa,bbb,ccc");
        pjExportReceiveArray.setSystemName("111,222,333");
        pjExportReceiveArray.setUserName("1111");
        pjExportReceiveArray.setPassWord("2222");
        PjExportReceiveArray pjExportReceiveArray2 = new PjExportReceiveArray();
        pjExportReceiveArray2.setId("2");
        pjExportReceiveArray2.setName("iiiooo");
        pjExportReceiveArray2.setEngineUrl("svn://192.168.1.36/iiiooo");
        pjExportReceiveArray2.setType("Subversion");
        pjExportReceiveArray2.setBusinessSystemName("ddd");
        pjExportReceiveArray2.setSystemName("444");
        pjExportReceiveArray2.setUserName("3333");
        pjExportReceiveArray2.setPassWord("4444");
        list.add(pjExportReceiveArray);
        list.add(pjExportReceiveArray2);
        PjExportReceiveArray[] arrays = list.toArray(new PjExportReceiveArray[0]);

    }

    public static void exportRepByPoi(PjExportReceiveArray[] arrays,
                               HttpServletRequest request,
                               HttpServletResponse response) {

        List<PjExportExcelMain> list = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++){
            PjExportExcelMain pjExportExcelMain = new PjExportExcelMain();
            //引擎赋值
            pjExportExcelMain.setEngineUrl(arrays[i].getEngineUrl());
            //类型赋值
            pjExportExcelMain.setType(arrays[i].getType());
            String orgById = "新维数联";
            //组织机构赋值
            pjExportExcelMain.setOrg(orgById);

            //业务系统集合
            List<PjExportExcelBusiness> lists = new ArrayList<>();

            //业务系统名称
            String businessSystemName = arrays[i].getBusinessSystemName();
            String[] businessSystemNames = businessSystemName.split(",");
            //业务系统id
            String businessSystemId = arrays[i].getBusinessSystemId();
            String[] businessSystemIds = businessSystemId.split(",");
            //服务应用
            String systemNameArr = arrays[i].getSystemName();
            String[] systemNames = systemNameArr.split(",");

            //遍历业务系统名称
            for (int m = 0; m<businessSystemNames.length; m++) {
                PjExportExcelBusiness pjExportExcelBusiness = new PjExportExcelBusiness();
                //业务系统名称赋值
                pjExportExcelBusiness.setName(businessSystemNames[m]);
                //根据业务系统id拿到服务应用
                List<String> systemList = getSystemByBusinessSystemId(businessSystemNames[m]);
                //前端传过来的服务应用于查出来的服务应用取交集
                List<String> list1 = Arrays.asList(systemNames);
                list1.retainAll(systemList);
                //定义服务应用的集合
                List<PjExportExcelSystem> pjExportExcelSystems = new ArrayList<>();
                //遍历交集
                for (String s : list1) {
                    PjExportExcelSystem pjExportExcelSystem = new PjExportExcelSystem();
                    //服务应用赋值
                    pjExportExcelSystem.setName(s);

                    CodeRepository codeRepository = new CodeRepository();
                    codeRepository.setType(arrays[i].getType());
                    codeRepository.setPath(arrays[i].getEngineUrl());
                    codeRepository.setUserName(arrays[i].getUserName());
                    codeRepository.setPassWord(arrays[i].getPassWord());

                    List<CodeRepository> branchesFromSystem = getBranchesFromSystem(codeRepository);
                    List<PjExportExcelBranch> branches = new ArrayList<>();
                    for (CodeRepository repository : branchesFromSystem) {
                        if (s.equals(repository.getSystemName())){
                            PjExportExcelBranch branch = new PjExportExcelBranch();
                            branch.setBranchName(repository.getCodeLineName());
                            branch.setBranchAddress(repository.getName());
                            branches.add(branch);
                        }
                    }
                    pjExportExcelSystem.setBranches(branches);

                    pjExportExcelSystems.add(pjExportExcelSystem);
                }
                pjExportExcelBusiness.setPjExportExcelSystemSet(pjExportExcelSystems);
                lists.add(pjExportExcelBusiness);
            }
            list.add(pjExportExcelMain);
        }

        //导出excel
        FileOutputStream output = null;
        long l = System.currentTimeMillis();
        try {
            output = new FileOutputStream("d:\\代码库信息"+l+".xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        IExcelUtil<PjExportExcelMain> eu = new ExcelUtils<>();
        eu.build(PjExportExcelMain.class).exportExcel(list, "代码库信息", output);
    }

    public static List<String> getSystemByBusinessSystemId(String s){

        return null;
    }

    public static List<CodeRepository> getBranchesFromSystem(CodeRepository codeRepository){

        return null;
    }

}
