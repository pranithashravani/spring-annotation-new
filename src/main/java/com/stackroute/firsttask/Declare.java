package com.stackroute.firsttask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Declare {
    @Bean
    public Actor actor()
    {
        Actor actor=new Actor();
        actor.setName("Pranitha");
        actor.setGender("Female");
        actor.setAge(22);
        return actor;
    }
    @Bean
    public Movie movie()
    {
        Movie movie =new Movie(actor());
        return movie;
    }
}
