package com.pallavikri;

import com.pallavikri.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
//        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        User obj = context.getBean(User.class);
        obj.code();
        System.out.println(obj.getAge());

//        Desktop dt = context.getBean(Desktop.class);
////        Desktop dt = context.getBean("desktop",Desktop.class);
////        Desktop dt = context.getBean("desktop" , Desktop.class);
//        dt.compile();
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();






































//        User obj = new User();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
////        User obj1 = (User) context.getBean("user1");
//        User obj1 = context.getBean("user1" , User.class);
//
////         obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();

//        User obj2 = (User) context.getBean("user1");
//        System.out.println(obj2.age);
//        obj2.code();

//        Desktop obj3 = (Desktop) context.getBean("comp1");
//        Desktop obj3 = context.getBean("comp1", Desktop.class);

    }
}
