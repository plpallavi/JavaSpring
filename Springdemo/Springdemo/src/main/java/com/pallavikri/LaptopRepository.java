package com.pallavikri;

import com.pallavikri.module.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Saved in DB");
    }
}
