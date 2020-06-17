package com.fkh.spring5;

/*JDK 动态代理*/
/*2.创建接口实现类，实现方法*/
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("旧方法执行");
        return a+b;
    }

    @Override
    public String update(String id) {
        return null;
    }
}
