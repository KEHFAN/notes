package com.fkh.spring5;

/*JDK 动态代理*/
/*1.创建接口，定义方法*/
public interface UserDao {
    public abstract int add(int a,int b);
    public abstract String update(String id);
}
