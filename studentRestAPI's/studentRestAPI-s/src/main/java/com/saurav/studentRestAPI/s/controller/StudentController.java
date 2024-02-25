package com.saurav.studentRestAPI.s.controller;

import com.saurav.studentRestAPI.s.exception.ResourceNotfoundException;
import com.saurav.studentRestAPI.s.model.Student;
import com.saurav.studentRestAPI.s.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RequestMapping("/api/v1/students")
@RestController
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @GetMapping
    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return repository.save(student);
    }
    //get by id
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudent(@PathVariable long id){
        Student student = repository.findById(id).orElseThrow(() -> new ResourceNotfoundException("Student id not found :- " +id));
        return ResponseEntity.ok(student);
    }
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable long id , @RequestBody Student student){
        Student updateStudent = repository.findById(id).orElseThrow(() -> new ResourceNotfoundException("Employee not exist with id : "+id));
        updateStudent.setFirstName(student.getFirstName());
        updateStudent.setLastName(student.getLastName());
        updateStudent.setEmail(student.getEmail());
        repository.save(updateStudent);
        return  ResponseEntity.ok(updateStudent);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable long id){
        Student student = repository.findById(id).orElseThrow(() -> new ResourceNotfoundException("Id not found :- " + id));
        repository.delete(student);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
