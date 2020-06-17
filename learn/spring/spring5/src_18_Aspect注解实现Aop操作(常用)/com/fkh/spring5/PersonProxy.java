package com.fkh.spring5;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*演示多个增强类对同一个方法进行增强，通过设置优先级进行区分*/
@Component
@Aspect
/*无论优先级高低，增强类最终都会执行增强逻辑
* 只是优先级高的增强类先执行，优先级低的增强类后执行*/
@Order(2)
public class PersonProxy {
    /*前置通知*/
    /*@Before注解表示作为前置通知*/
    @Before(value = "execution(* com.fkh.spring5.User.add(..))")
//    @Before(value = "pointdemo()")/*简化书写*/
    public void before() {/*前置通知*/
        System.out.println("personProxy before....");
    }

}
