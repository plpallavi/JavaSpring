package com.pallavikri;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop Object Created");
    }
    @Override
    public void compile(){
        System.out.println("Compiling with Laptop");
    }
}
