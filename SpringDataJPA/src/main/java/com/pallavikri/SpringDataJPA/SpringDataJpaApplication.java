package com.pallavikri.SpringDataJPA;

import com.pallavikri.SpringDataJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(01);
//		s1.setName("Pallavi");
//		s1.setMarks(75);
//
//		s2.setRollNo(02);
//		s2.setName("Saloni");
//		s2.setMarks(95);

		s3.setRollNo(03);
		s3.setName("Harsh");
		s3.setMarks(70);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());
//		System.out.println(repo.findById(02));
//		System.out.println(repo.findByName("Pallavi"));
//		System.out.println(repo.findByMarks(88));
//		System.out.println(repo.findByMarksGreaterThan(70));


		repo.delete(s3);


	}

}
