package com.stackroute.firsttask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Declare {
    @Bean
    public Actor actor()
    {
        Actor actor=new Actor(22,"Pranitha","Female");
        return actor;
    }
    @Bean({"movieA","movieB"})
    @Scope("prototype")

    public Movie movie()
    {
        Movie movie =new Movie(actor());
        return movie;
    }
}
