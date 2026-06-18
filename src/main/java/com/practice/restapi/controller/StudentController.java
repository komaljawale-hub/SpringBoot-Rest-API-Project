package com.practice.restapi.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.practice.restapi.repository.StudentRepository;
import com.practice.restapi.entity.Student;

@RestController
public class StudentController {


    @Autowired
    StudentRepository repo;
    //get all the students
    //localhost:8080/students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = repo.findAll();
        return students;
    }

    //localhost:8080/students/1
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){

        Student student = repo.findById(id).get();
        return student;

    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        repo.save(student);

    }

    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable int id){
        Student student = repo.findById(id).get();
        student.setName("Poonam");
        student.setAddress("Beed");
        repo.save(student);
        return student;
    }

    @DeleteMapping("/student/delete/{id}")
    public void removeStudent(@PathVariable int id){
        Student student = repo.findById(id).get();
        repo.delete(student);
    }

}
