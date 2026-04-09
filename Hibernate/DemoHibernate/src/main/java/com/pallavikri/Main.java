package com.pallavikri;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import jakarta.persistence.Id;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;


public class Main {
    static void main() {
//        Student s1 = new Student();
//
//        s1.setsName("Satyam");
//        s1.setRollNo(6);
//        s1.setsAge(20);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.pallavikri.Student.class);
//        cfg.configure();
//        SessionFactory sf = cfg.buildSessionFactory();

//        Laptop l1 = new Laptop();
//        l1.setLid(101);
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam(16);
//
//        Laptop l2 = new Laptop();
//        l2.setLid(102);
//        l2.setBrand("Lenovo");
//        l2.setModel("Thinkbook");
//        l2.setRam(32);
//
//        Laptop l3 = new Laptop();
//        l3.setLid(103);
//        l3.setBrand("Dell");
//        l3.setModel("XPS");
//        l3.setRam(8);
//
//        Programmer pro = new Programmer();
//        pro.setId(1);
//        pro.setName("Pallavi");
//        pro.setTech("Java");
//
//        Programmer pro1 = new Programmer();
//        pro1.setId(2);
//        pro1.setName("Saloni");
//        pro1.setTech("C++");
//
//
//        pro.setLaptops(Arrays.asList(l1, l2));
//        pro1.setLaptops(Arrays.asList(l3));
//
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.pallavikri.Programmer.class)
//                .addAnnotatedClass(com.pallavikri.Laptop.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
////        s1 =session.get(Student.class, 4);
//
////        Transaction tx = session.beginTransaction();
//
////        session.persist(s1); //To Save the data
////        session.merge(s1); // Can be used for save(to create a new reccord) or Update the data
//
////        session.remove(s1); // To remove/delete the data
////          tx.commit();
////        ------To Fetch Data---------
////        Student s2 = null;
////        s2 = session.get(Student.class,3);
//
//        Transaction trans = session.beginTransaction();
//
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);
//
//        session.persist(pro);
//        session.persist(pro1);
//
//        trans.commit();
//
////        Programmer prog5 = session.get(Programmer.class, 1);
////        System.out.println(prog5);
//
//        session.close();
//
//        Session session1 = sf.openSession();
//        Programmer prog5 = session1.get(Programmer.class, 1);
//        System.out.println(prog5);
//
//        session1.close();
//
//        sf.close();
//
//        Laptop l1 = new Laptop();
//        l1.setLid(104);
//        l1.setBrand("Asus");
//        l1.setModel("Strix");
//        l1.setRam(32);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.pallavikri.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

//        Transaction tnx = session.beginTransaction();
//        session.persist(l1);
//        tnx.commit();


//        select * from laptop where ram = 32 -> SQL
//        from Laptop where ram = 32

//        Query query = session.createQuery("from Laptop");
//          Query query = session.createQuery("From Laptop where brand like 'Asus'", Laptop.class);
        String brand = "Asus";

        Query query = session.createQuery("select brand, model from Laptop where brand like ?1");
        query.setParameter(1, brand);

//        List<Laptop> laptops = query.getResultList();
//        Laptop l1 = session.get(Laptop.class, 103);
//        System.out.println(laptops);

        List<Object[]> laptops  = query.getResultList();

        for(Object[] data : laptops){
            System.out.println((String) data[0] + " " + (String) data[1]);
        }

        session.close();
        sf.close();
    }
}
