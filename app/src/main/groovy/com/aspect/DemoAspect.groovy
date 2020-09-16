package com.aspect

import com.annotation.ClearCache
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component

import java.lang.reflect.Method

@Aspect
@Component
class DemoAspect {

    /**
     * http访问方法之后切入
     */
    @After(value = "@annotation(com.annotation.ClearCache)")
    void afterLog(JoinPoint jointPoint) {
        MethodSignature signature = (MethodSignature) jointPoint.getSignature()
        Method method = signature.getMethod()
        ClearCache clearCache = method.getAnnotation(ClearCache.class)
        String[] value = clearCache.value()
        println value
    }
}
