package com.fkh.spring5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Course {

    /*无参构造*/
    public Course() {
        System.out.println("第一步：执行无参构造创建bean实例");
    }

    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
        System.out.println("第二步：调用set方法设置属性值");
    }

    public void initMethod(){
        System.out.println("第三步：执行初始化的方法");
    }

    public void destroyMethod(){
        System.out.println("第五步：执行销毁的方法");
    }
}
