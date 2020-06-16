package com.fkh.spring5;
/*
* 演示使用set方法注入属性
* */
public class Book {
    /*定义普通属性*/
    private String bname1;
    private String bname2;
    private String bname3;
    private String bauthor;
    /*生成对应的Set方法*/
    public void setBname1(String bname1) {
        this.bname1 = bname1;
    }
    public void setBname2(String bname2) {
        this.bname2 = bname2;
    }
    public void setBname3(String bname3) {
        this.bname3 = bname3;
    }
    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
    /*重写toString用于输出对象*/
    @Override
    public String toString() {
        return "Book{" +
                "bname1='" + bname1 + '\'' +
                ", bname2='" + bname2 + '\'' +
                ", bname3='" + bname3 + '\'' +
                ", bauthor='" + bauthor + '\'' +
                '}';
    }
}
