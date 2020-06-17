package com.fkh.spring5;

public class Empe {
    private String ename;
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Empe{" +
                "ename='" + ename + '\'' +
                ", dept=" + dept +
                '}';
    }
}
