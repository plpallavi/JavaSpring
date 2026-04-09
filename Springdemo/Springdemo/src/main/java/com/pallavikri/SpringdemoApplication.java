package com.pallavikri;

import com.pallavikri.module.Laptop;
import com.pallavikri.module.User;
import com.pallavikri.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);
//		System.out.println("Hii");

//		User obj = context.getBean(User.class);
//		System.out.println(obj.getAge());
//		obj.code();

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}
}
