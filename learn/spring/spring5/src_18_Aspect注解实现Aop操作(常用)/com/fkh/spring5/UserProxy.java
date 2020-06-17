package com.fkh.spring5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*Aspect J注解实现AOP操作*/
/*2.创建增强类，编写增强逻辑*/
@Component
@Aspect /*增强类上添加该注解,生成代理对象*/
/*无论优先级高低，增强类最终都会执行增强逻辑
 * 只是优先级高的增强类先执行，优先级低的增强类后执行*/
@Order(3)/*有多个增强类对同一个方法进行增强，设置增强类优先级，值越小优先级越高*/
public class UserProxy {

    /*
    切入点表达式：execution([权限修饰符][返回类型][类全路径][方法名称]([参数列表]))
    * 举例1：对com.atguigu.dao.BookDao类里面的add方法进行增强
    execution(* com.atguigu.dao.BookDao.add(..))
    * 举例2：对com.atguigu.dao.BookDao类里面的所有方法进行增强
    execution(* com.atguigu.dao.BookDao.*(..))
    * 举例3：对com.atguigu.dao包里的所有类，类里所有方法进行增强
    execution(* com.atguigu.dao*.*(..))
    第一个*表示：任何权限修饰符都允许
    第二个*表示：dao下的所有包的所有类
    第三个*表示：类中所有方法
    第四个..表示：方法中的所有参数
    */

    /*抽取相同切入点，简化书写*/
    @Pointcut(value = "execution(* com.fkh.spring5.User.add(..))")
    public void pointdemo(){}

    /*前置通知*/
    /*@Before注解表示作为前置通知*/
    /*@Before(value = "execution(* com.fkh.spring5.User.add(..))")*/
    @Before(value = "pointdemo()")/*简化书写*/
    public void before() {/*前置通知*/
        System.out.println("before....");
    }

    /*后置通知（返回通知）*/
    /*@AfterReturning(value = "execution(* com.fkh.spring5.User.add(..))")*/
    @AfterReturning(value = "pointdemo()")/*简化书写*/
    public void afterReturning() {
        System.out.println("afterReturning....");
    }

    /*最终通知*/
    /*@After(value = "execution(* com.fkh.spring5.User.add(..))")*/
    @After(value = "pointdemo()")/*简化书写*/
    public void after() {
        System.out.println("after....");
    }

    /*异常通知*/
    /*@AfterThrowing(value = "execution(* com.fkh.spring5.User.add(..))")*/
    @AfterThrowing(value = "pointdemo()")/*简化书写*/
    public void afterThrowing() {
        System.out.println("afterThrowing.....");
    }

    /*环绕通知*/
    /*@Around(value = "execution(* com.fkh.spring5.User.add(..))")*/
    @Around(value = "pointdemo()")/*简化书写*/
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前。。。。");
        /*被增强的方法执行*/
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕之后。。。。");

        return proceed;
    }
}
