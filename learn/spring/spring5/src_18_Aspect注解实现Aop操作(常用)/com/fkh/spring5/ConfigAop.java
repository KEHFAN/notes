package com.fkh.spring5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*完全注解开发，使用此类代替xml文件*/
@Configuration/*表明此类为配置类，代替xml*/
@ComponentScan(basePackages = {"com.fkh.spring5"})/*开启注解扫描*/
@EnableAspectJAutoProxy(proxyTargetClass = true)/*开启Aspect生成代理对象*/
public class ConfigAop {
}
