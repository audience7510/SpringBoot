package com.audience.admin.model;

import com.audience.admin.excel.annotation.ExcelAttribute;
import com.audience.admin.excel.annotation.ExcelElement;
import com.audience.admin.excel.annotation.ExcelID;

import java.util.*;

public class School {

    @ExcelID
    @ExcelAttribute(name="学校编号",column="A")
    private String id;

    @ExcelAttribute(name="学校名称",column="B")
    private String name;

    @ExcelElement
    private List<Clazz> clazzs =  new ArrayList<>();

//    @ExcelElement
//    @ExcelAttribute(name="学校描述",column="C")
//    private Map<String,String> map = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Clazz> getClazzs() {
        return clazzs;
    }

    public void setClazzs(List<Clazz> clazzs) {
        this.clazzs = clazzs;
    }

//    public Map<String, String> getMap() {
//        return map;
//    }
//
//    public void setMap(Map<String, String> map) {
//        this.map = map;
//    }
}
