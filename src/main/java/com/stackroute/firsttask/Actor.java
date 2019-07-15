package com.stackroute.firsttask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Actor {
    private int age;
    private String gender;

    private String name;


    public void setName(String name) {
        this.name = name;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }



    public void setAge(int age) {
        this.age = age;
    }

public Actor()
{
    this.age=age;
    this.name=name;
    this.gender=gender;
}
@Override
    public String toString()
    {
        return "name " +  name + " age " + age + " gender " +  gender;
                }
}
