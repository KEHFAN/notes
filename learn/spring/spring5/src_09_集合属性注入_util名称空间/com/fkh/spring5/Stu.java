package com.fkh.spring5;

import java.util.List;

public class Stu {

    /*2.List集合类型属性*/
    private List<String> list;
    /*5.包含对象的List集合类型属性*/
    private List<Course> courseList;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "list=" + list +
                ", courseList=" + courseList +
                '}';
    }
}
