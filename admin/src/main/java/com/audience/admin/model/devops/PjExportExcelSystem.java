package com.audience.admin.model.devops;


import com.audience.admin.excel.annotation.ExcelAttribute;
import com.audience.admin.excel.annotation.ExcelElement;
import com.audience.admin.excel.annotation.ExcelID;

import java.util.ArrayList;
import java.util.List;

public class PjExportExcelSystem {

    @ExcelID
    @ExcelAttribute(name="服务应用",column="E")
    private String name;

    @ExcelElement
    private List<PjExportExcelBranch> branches = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PjExportExcelBranch> getBranches() {
        return branches;
    }

    public void setBranches(List<PjExportExcelBranch> branches) {
        this.branches = branches;
    }
}
