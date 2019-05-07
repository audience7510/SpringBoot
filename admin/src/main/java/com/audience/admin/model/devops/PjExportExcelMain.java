package com.audience.admin.model.devops;

import com.audience.admin.excel.annotation.ExcelAttribute;
import com.audience.admin.excel.annotation.ExcelElement;
import com.audience.admin.excel.annotation.ExcelID;

import java.util.ArrayList;
import java.util.List;

public class PjExportExcelMain {

    @ExcelID
    @ExcelAttribute(name="代码库地址",column="A")
    private String engineUrl;

    @ExcelAttribute(name="代码库类型",column="B")
    private String type;

    @ExcelAttribute(name="所属机构",column="C")
    private String org;

    @ExcelElement
    private List<PjExportExcelBusiness> pjExportExcelBusinesses = new ArrayList<>();

    public String getEngineUrl() {
        return engineUrl;
    }

    public void setEngineUrl(String engineUrl) {
        this.engineUrl = engineUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public List<PjExportExcelBusiness> getPjExportExcelBusinesses() {
        return pjExportExcelBusinesses;
    }

    public void setPjExportExcelBusinesses(List<PjExportExcelBusiness> pjExportExcelBusinesses) {
        this.pjExportExcelBusinesses = pjExportExcelBusinesses;
    }
}
