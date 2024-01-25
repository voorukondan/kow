// Write your code here
package com.example.school.repository;

import org.springframework.stereotype.Repository;
import com.example.school.model.Student;
import java.util.ArrayList;

@Repository
public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student getStudentById(int studentId);

    Student addSingleStudent(Student student);

    String addMultipleStudents(ArrayList<Student> studentsList);

    Student updatStudent(int studentId, Student student);

    void deleteStudent(int studentId);
}