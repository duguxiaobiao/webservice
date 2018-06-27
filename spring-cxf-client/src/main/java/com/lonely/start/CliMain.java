package com.lonely.start;

import com.lonely.pojo.Student;
import com.lonely.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 15072 on 2018/6/28.
 */
public class CliMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = (StudentService) applicationContext.getBean("studentClient");
        Student student = studentService.findByName("lonely");
        System.out.println(student);

    }
}
