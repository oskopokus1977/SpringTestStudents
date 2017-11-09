package com.dao;

import com.model.Students;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("StudentDAO")
public class StudentDAO implements StudentDAOInterface {
    private List<Students> studentsList = Arrays.asList(new Students("student1"), new Students("student2"));

    public List<Students> getAllStudents() {
        return studentsList;
    }
}
