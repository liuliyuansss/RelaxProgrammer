package cn.RelaxProgrammer.aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * 创建添加定义一个使用注解的方式实现日志事物增强前置增强后置增强环绕增强和最终增强的实现方法并且别忘记给所应有的属性赋予初始值
 */
@Aspect
public class MyLogger {
    private Logger logger=Logger.getLogger(MyLogger.class);
    @Pointcut("execution(* cn.RelaxProgrammer.userService..*(..))")
    public void pointcut(){}

    /**
     * 创建添加定义一个切入点给myLogger添加定义一个前置增强后置增强环绕增强最终增强异常处理增强
     * @param jp
     */
    /**
     * 创建添加定义一个前置增强的方法并且别忘记给所有的属性赋予初始值
     * @param jp
     */
    @Before("pointcut()")
    public void before(JoinPoint jp){
        logger.info("调用:"+jp.getTarget()+"的"+jp.getSignature().getName()+
                "方法。方法入参:"+ Arrays.toString(jp.getArgs()));
    }
    /**
     * 创建添加定义一个后置增强的方法并且别忘记给所有的属性赋予初始值
     */
    @AfterReturning(pointcut = "pointcut()",returning = "returnValue")
    public void afterReturning(JoinPoint jp,Object returnValue){
        logger.info("调用："+jp.getTarget()+"的"+jp.getSignature().getName()
                +"方法。方法的返回值:"+returnValue);

    }

    /**
     * 创建添加定义一个异常处理增强并且别忘记给所有的属性赋予初始值
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(pointcut = "pointcut()",throwing = "e")
    public  void afterThrowing(JoinPoint joinPoint,RuntimeException e){
        logger.debug(joinPoint.getSignature().getName()+"方法"+"发生异常"+e);

    }
    /**
     * 创建添加定义一个最终类的增强的方法并且别忘记给所应有的属性赋予初始值
     * @param joinPoint
     */
    @After("pointcut()")
    public void afterLogger(JoinPoint joinPoint){
        logger.debug(joinPoint.getSignature().getName()+"方法结束执行！");
    }
    /**
     * 创建添加定义一个环绕增强的方法并且别忘记给所有的属性赋予初始值
     */
    @Around("pointcut()")
    public Object aroundLogger(ProceedingJoinPoint point) throws Throwable{
        logger.debug("调用"+point.getTarget()+"的"+point.getSignature().getName()+
                "方法,方法入参:"+ Arrays.toString(point.getArgs()));
        try {
            Object resultValue= point.proceed();//创建添加定义一个执行增强的方法具体的前置增强后置增强最终鞥强环绕增强异常处理增强用来接收返回值
            logger.debug("调用:"+point.getTarget()+"的"+point.getSignature().getName()+"方法"+
                    "方法的返回值为:"+resultValue);
            return resultValue;
        } catch (Throwable e) {
            logger.error(point.getTarget()+"方法发生异常:"+e);
            throw  e;
        } finally {
            logger.debug(point.getSignature().getName()+"方法结束执行");
        }
    }
}
