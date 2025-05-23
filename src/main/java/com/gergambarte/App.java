package com.gergambarte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        /* ApplicationContext:
            https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Developer dev = (Developer) context.getBean("developer");
        dev.code();


    }
}