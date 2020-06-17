package com.fkh.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.AbstractFileResolvingResource;
import org.springframework.stereotype.Component;

/*基于注解方式，需要在配置文件中
*   开启 组件扫描*/

/*Spring针对Bean管理创建对象提供的注解：
*   1. @Component
*   2. @Service
*   3. @Controller
*   4. @Repository
* 上面四个注解功能相同，都可以用来创建bean实例*/

/*注解中value属性值可以省略
* 默认值是类名称，首字母小写
* DruidDataSource -> druidDataSource*/
@Component(value = "dataSource") /*等价于：<bean id="dataSource" class=".." */
public class DruidDataSource {
    /*定义Course类型属性
    * 不需要添加set和get方法
    * 但是需要在Course类上添加注解用于创建对象,例如@Service*/
    @Autowired/*该注解，可根据属性类型进行自动装配，只能是bean可以创建的对象类型*/
    private Course course;
    /*一起使用*/
    @Autowired
    @Qualifier(value = "courseImpl")
    private Course course1;
    /*@Resource //根据类型注入
    @Resource(name="courseImpl") //根据名称注入
    private Course course2;*/

    @Value(value = "aaa")/*注入普通类型属性*/
    private String name2;

    @Override
    public String toString() {
        return "DruidDataSource{" +
                "course=" + course +
                ", course1=" + course1 +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
