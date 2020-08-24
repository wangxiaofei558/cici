package com.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContextHolder instance;
    private ApplicationContext applicationContext;

    public ApplicationContextHolder(){
        instance = this;
    }

    public static ApplicationContext getApplicationContext(){
        return instance == null ? null : instance.applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
