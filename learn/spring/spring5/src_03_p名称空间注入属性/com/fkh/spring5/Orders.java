package com.fkh.spring5;

/*演示有参构造注入属性*/
public class Orders {
    /*定义属性*/
    private String oname;
    private String address;
    /*定义set方法*/
    public void setOname(String oname) {
        this.oname = oname;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    /*重写toString*/
    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
