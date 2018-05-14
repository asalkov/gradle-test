package com.ansa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext(Info.class);

        System.out.println("Runner>>>>" + context.getBean(Obj.class).getValue());
    }
}
