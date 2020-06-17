package com.fkh.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/*JDK 动态代理*/
/*3.创建代理对象*/
public class UserDaoProxy implements InvocationHandler {

    private Object obj;
    /*创建的代理对象通过有参构造传递进来*/
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    /*增强逻辑的代码*/
    @Override/*参数：o是代理对象；method是需要增强的方法；objects是方法的参数列表*/
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        /*增强方法之前添加的逻辑*/
        System.out.println("旧方法执行之前增加代码。"+
                method.getName()+":传递的参数("+
                Arrays.toString(objects) +")");
        /*被增强的方法在此处执行*/
        Object invoke = method.invoke(obj, objects);
        /*增强方法之后添加的逻辑*/
        System.out.println("旧方法执行之后增加代码。"+
                obj);
        return invoke;
    }
}
