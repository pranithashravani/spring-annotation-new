package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Beanlifecycledemo implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("initialize");
        //Bean initialization code
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("destroy");
        //Bean destruction code
    }
    public void customInit()
    {
        System.out.println("Method customInit() invoked...");
    }

    public void customDestroy()
    {
        System.out.println("Method customDestroy() invoked...");
    }
    public void display()
    {
        System.out.println("printed");
    }
}
