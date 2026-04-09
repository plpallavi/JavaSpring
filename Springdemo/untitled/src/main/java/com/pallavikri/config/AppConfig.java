package com.pallavikri.config;

import com.pallavikri.Computer;
import com.pallavikri.Desktop;
import com.pallavikri.Laptop;
import com.pallavikri.User;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.pallavikri")
public class AppConfig {

//    @Bean
//    public User user(Computer comp){    //public User user(Computer comp)
//        User obj = new User();
//        obj.setAge(25);
//        obj.setComp(comp);
//        return obj;
//    }
////    @Bean (name = {"desk1", "desk2", "desk3"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
