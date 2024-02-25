package com.saurav.studentRestAPI.s;

import com.saurav.studentRestAPI.s.model.Student;
import com.saurav.studentRestAPI.s.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student();
//		student.setFirstName("Saurav");
//		student.setLastName("Deshmane");
//		student.setEmail("saurav@gmail.com");
//		studentRepository.save(student);
	}
}
