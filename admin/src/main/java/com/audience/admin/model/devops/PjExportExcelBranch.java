package com.audience.admin.model.devops;

import com.audience.admin.excel.annotation.ExcelAttribute;
import com.audience.admin.excel.annotation.ExcelID;

public class PjExportExcelBranch {

    @ExcelID
    @ExcelAttribute(name="分支名称",column="F")
    private String branchName;

    @ExcelAttribute(name="分支地址",column="G")
    private String branchAddress;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
}
