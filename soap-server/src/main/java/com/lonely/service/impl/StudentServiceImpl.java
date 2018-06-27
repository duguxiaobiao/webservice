package com.lonely.service.impl;

import com.lonely.pojo.Student;
import com.lonely.service.StudentService;

import javax.jws.WebService;

/**
 * Created by 15072 on 2018/6/27.
 */
@WebService
public class StudentServiceImpl implements StudentService {

    @Override
    public Student findByName(String name) {
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(18);
        return stu;
    }
}
