package com;

import com.dao.StudentDAO;
import com.dao.StudentDAOInterface;
import com.model.Students;
import com.service.StudentService;
import com.service.StudentServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentController {
    public static void main(String[] args) {
//        StudentServiceInterface studentService = new StudentService();
//        List<Students>students = studentService.getAllStudents();
//        System.out.println(students);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentServiceInterface studentService = applicationContext.getBean("studentService", StudentService.class);
        List<Students>students = studentService.getAllStudents();
        System.out.println(students);



    }
}
