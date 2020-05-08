package com.njit.mockito.dao;

import com.njit.mockito.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @ClassName StudentDao
 * @Description TODO
 * @auther zhuyoude
 * @Date 2020/5/8 9:01
 * @Version 1.0
 **/
@Repository
public class StudentDao {

    // 模拟一下
    public Student getStudentById(int id){
        Student student = new Student(id, 18, "Tony");
        return student;
    }
}
