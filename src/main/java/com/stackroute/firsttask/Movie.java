package com.stackroute.firsttask;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie {



    private Actor ac;
//private BeanFactory beanFactory;
//private ApplicationContext context;
//private BeanNameAware beanname;
    public void setAc(Actor ac) {
        this.ac = ac;
    }

    public Actor getAc() {
        return ac;
    }
@Override
    public String toString()
    {
     return ac.toString();

    }
 @Autowired
    public Movie(Actor actor) {
        this.ac = actor;
    }

  /* @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       this.context = context;
   }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        this.beanname=beanname;
    }*/
}
