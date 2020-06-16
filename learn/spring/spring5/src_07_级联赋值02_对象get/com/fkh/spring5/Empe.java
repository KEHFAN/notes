package com.fkh.spring5;

public class Empe {
    private String ename;
    private String gender;
    /*一个员工属于某个部门*/
    private Dept dept;

    /*使用级联赋值，需要生成dept对象的get方法*/
    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Empe{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
