package com.pallavikri.springBoot_Rest.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // @Before("execution(return type, class-name.method-name(args))")
    @Before("execution(* com.pallavikri.springBoot_Rest.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method Called " + jp.getSignature().getName());
    }

    @After("execution(* com.pallavikri.springBoot_Rest.service.JobService.getJob(..)) || execution(* com.pallavikri.springBoot_Rest.service.JobService.getJob(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.pallavikri.springBoot_Rest.service.JobService.getJob(..)) || execution(* com.pallavikri.springBoot_Rest.service.JobService.getJob(..))")
    public void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method has some issues " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.pallavikri.springBoot_Rest.service.JobService.getJob(..)) || execution(* com.pallavikri.springBoot_Rest.service.JobService.getJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info("Method Executed Successfully " + jp.getSignature().getName());
    }
}
