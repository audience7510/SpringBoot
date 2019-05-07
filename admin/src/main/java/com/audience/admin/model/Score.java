package com.audience.admin.model;

import com.audience.admin.excel.annotation.ExcelAttribute;
import com.audience.admin.excel.annotation.ExcelID;

import java.util.ArrayList;
import java.util.List;

public class Score {
    @ExcelID
    @ExcelAttribute(name="编号",column="J")
    private String id;

    @ExcelAttribute(name="名称",column="K")
    private List<String> name = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }
}
