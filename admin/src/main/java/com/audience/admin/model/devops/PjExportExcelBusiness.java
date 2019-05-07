package com.audience.admin.model.devops;

import com.audience.admin.excel.annotation.ExcelAttribute;
import com.audience.admin.excel.annotation.ExcelElement;
import com.audience.admin.excel.annotation.ExcelID;

import java.util.ArrayList;
import java.util.List;

public class PjExportExcelBusiness {

    @ExcelID
    @ExcelAttribute(name="业务系统",column="D")
    private String name;

    @ExcelElement
    private List<PjExportExcelSystem> pjExportExcelSystemSet = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PjExportExcelSystem> getPjExportExcelSystemSet() {
        return pjExportExcelSystemSet;
    }

    public void setPjExportExcelSystemSet(List<PjExportExcelSystem> pjExportExcelSystemSet) {
        this.pjExportExcelSystemSet = pjExportExcelSystemSet;
    }
}
