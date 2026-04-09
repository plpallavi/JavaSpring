package com.pallavikri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class User {

    @Value("25")
    private int age;
    @Autowired
    @Qualifier("desktop")
    private Computer comp;

    public User(){
        System.out.println("Object Created");
    }

//    @ConstructorProperties({"age", "comp"})
//    public User(int age, Computer comp){
//        System.out.println("Parameterised Constructor Called");
//        this.age = age;
//        this.comp = comp;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding...");
        comp.compile();

    }
}
