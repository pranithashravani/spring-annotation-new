package com.stackroute;

import com.stackroute.demo.BeanPostProcessordemobean;
import com.stackroute.firsttask.Declare;
import com.stackroute.firsttask.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(Declare.class);
        context.refresh();
        context.scan("com.stackroute");
        Movie movie=context.getBean("movienew", Movie.class);
        BeanPostProcessordemobean beanPostProcessorDemoBean=context.getBean(BeanPostProcessordemobean.class);
        beanPostProcessorDemoBean.postProcessAfterInitialization(movie,"movienew");
        beanPostProcessorDemoBean.postProcessBeforeInitialization(movie,"movienew");
        System.out.println(beanPostProcessorDemoBean);






    }

}
