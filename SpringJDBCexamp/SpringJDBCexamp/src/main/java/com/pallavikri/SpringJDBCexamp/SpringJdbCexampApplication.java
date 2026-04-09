package com.pallavikri.SpringJDBCexamp;

import com.pallavikri.SpringJDBCexamp.model.Student;
import com.pallavikri.SpringJDBCexamp.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCexampApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbCexampApplication.class, args);
//		System.out.println("Hello World");

		Student s = context.getBean(Student.class);
		s.setRollNo(01);
		s.setName("Pallavi");
		s.setMarks(99);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
