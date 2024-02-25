package com.saurav.studentRestAPI.s.repository;

import com.saurav.studentRestAPI.s.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
