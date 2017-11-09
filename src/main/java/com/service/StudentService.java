package com.service;

import com.dao.StudentDAOInterface;
import com.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService implements StudentServiceInterface {
    @Autowired
    private StudentDAOInterface studentDAO;



//    public StudentService(StudentDAOInterface studentDAO) {
//        this.studentDAO = studentDAO;
//    }

//    public StudentService() {
//    }


//    public void setStudentDAO(StudentDAOInterface studentDAO) {
//        this.studentDAO = studentDAO;
//    }

    public List<Students> getAllStudents() {
        return studentDAO.getAllStudents();
    }

}
