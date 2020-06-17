package com.fkh.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        /*创建接口实现类代理对象*/
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        /*第一参数：类加载器；
        * 第二参数：被增强方法所在的类实现的接口，支持多个接口(数组),UserDaoImpl implements UserDao
        * 第三参数：创建代理对象，写增强的方法*/
//        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,
//                new UserDaoProxy(userDao));/*new UserDapProxy(userDao)有参构造传入代理对象*/
//        int result =dao.add(1,2);
//        System.out.println("result:"+result);

        /*匿名对象简写*/
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        /*增强方法之前添加的逻辑*/
                        System.out.println("旧方法执行之前增加代码。"+
                                method.getName()+":传递的参数("+
                                Arrays.toString(objects) +")");
                        /*被增强的方法在此处执行*/
                        Object invoke = method.invoke(userDao, objects);
                        /*增强方法之后添加的逻辑*/
                        System.out.println("旧方法执行之后增加代码。"+
                                userDao);
                        return invoke;
                    }
                });
        int result =dao.add(1,2);
        System.out.println("result:"+result);
    }
}
