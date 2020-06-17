package com.fkh.spring5;

import org.springframework.beans.factory.FactoryBean;

/*演示工厂bean：
*   在配置文件中定义的bean类型可以和返回类型不一样*/
public class MyBean implements FactoryBean<Course> {
    /*定义返回的bean*/
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abcd");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
