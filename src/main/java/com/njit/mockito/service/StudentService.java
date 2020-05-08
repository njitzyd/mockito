package com.njit.mockito.service;

import com.njit.mockito.dao.StudentDao;
import com.njit.mockito.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentService
 * @Description TODO
 * @auther zhuyoude
 * @Date 2020/5/8 9:03
 * @Version 1.0
 **/
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    // 业务
    public Student getStudentById(int id){
        Student student = studentDao.getStudentById(id);
        return student;
    }


}
