package com.fkh.spring5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*完全使用注解开发，不用xml配置*/
/*需要单独创建spring配置类，并添加@Configuration注解，表示这是一个配置类*/
@Configuration/*设定配置类，替代xml文件*/
@ComponentScan(basePackages = {"com.fkh.spring5"})/*开启组件扫描*/
public class SpringConfig {
}
