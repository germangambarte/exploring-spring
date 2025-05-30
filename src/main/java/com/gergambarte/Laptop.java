package com.gergambarte;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lap")
@Scope("prototype")
public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling with Laptop");
    }

}
