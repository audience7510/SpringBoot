package com.audience.admin.demo;

import com.audience.admin.excel.core.ExcelTool;
import com.audience.admin.excel.core.ExcelUtils;
import com.audience.admin.excel.core.IExcelUtil;
import com.audience.admin.model.Clazz;
import com.audience.admin.model.School;
import com.audience.admin.model.Score;
import com.audience.admin.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

public class ExportExcel {
    private Logger logger = LoggerFactory.getLogger(ExportExcel.class);

    public static void main(String[] args) {
        for (int i =0;i<2;i++){
            exportExcel();
        }

    }

    public static void exportExcel(){

        List<Score> scores = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        Score score = new Score();
        score.setId("11111");
        stringList.add("aaa");
        stringList.add("bbb");
        score.setName(stringList);
        Score score2 = new Score();
        score2.setId("22222");
        score.setName(stringList);
        scores.add(score);
        scores.add(score2);

        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setId("121");
        student.setAge(8);
        student.setName("小明");
        student.setScores(scores);
        students.add(student);

//        Map<String,String> sMap = new HashMap<>();
//        sMap.put("性别", "男");
//        sMap.put("地址", "济南");
        Student student2 = new Student();
        student2.setId("122");
        student2.setAge(9);
        student2.setName("小李");
        student2.setScores(scores);
//        student2.setMap(sMap);
        students.add(student2);


        List<Clazz> clazzs = new ArrayList<>();

        Clazz clazz = new Clazz();
        clazz.setId("11");
        clazz.setName("一年级");
        clazz.setStudents(students);
        clazzs.add(clazz);

        Clazz clazz2 = new Clazz();
        clazz2.setId("12");
        clazz2.setName("二年级");
        clazz2.setStudents(students);
        clazzs.add(clazz2);

        Clazz clazz3 = new Clazz();
        clazz3.setId("13");
        clazz3.setName("三年级");
        clazzs.add(clazz3);

        Clazz clazz4 = new Clazz();
        clazz4.setId("14");
        clazz4.setName("四年级");
        clazz4.setStudents(students);
        clazzs.add(clazz4);

        List<School> list = new ArrayList<>();

        School school = new School();
        school.setId("1");
        school.setName("中山");
        school.setClazzs(clazzs);
        list.add(school);

//        Map<String,String> map = new HashMap<>();
//        map.put("1", "红星小学");
//        map.put("2", "TOP");
        School school1 = new School();
        school1.setId("2");
        school1.setName("红星");
        school1.setClazzs(clazzs);
//        school1.setMap(map);
        list.add(school1);

        FileOutputStream output = null;
        try {
            output = new FileOutputStream("d:\\success3.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        IExcelUtil<School> eu = new ExcelUtils<>();
        eu.build(School.class).exportExcel(list, "学校信息", output);
        ExcelTool.setNum(0);

    }
}
