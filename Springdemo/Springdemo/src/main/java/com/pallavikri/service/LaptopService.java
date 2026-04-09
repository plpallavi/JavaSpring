package com.pallavikri.service;

import com.pallavikri.LaptopRepository;
import com.pallavikri.module.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
//        System.out.println("method called");
        repo.save(lap);
    }

    public boolean isGoodForUse(Laptop lap){
        return true;
    }
}
