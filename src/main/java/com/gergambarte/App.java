package com.gergambarte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gergambarte.config.AppConfig;

public class App
{
    public static void main( String[] args )
    {
        /* ApplicationContext:
            https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html
        */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Developer dev = context.getBean("developer", Developer.class);
        dev.code();


    }
}