package com.fkh.spring5;

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

}
