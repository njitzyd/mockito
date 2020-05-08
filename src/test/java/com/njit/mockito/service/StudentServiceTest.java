package com.njit.mockito.service;

import com.njit.mockito.dao.StudentDao;
import com.njit.mockito.model.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceTest {

    @Autowired
    StudentService studentService1;

    @Test
//      一般使用
   public void getStudentById() {
        Student student = studentService1.getStudentById(2);
        Assert.assertNotNull(student);
        Assert.assertEquals(student.getName(),"Tony");
        Assert.assertEquals(student.getAge(),new Integer(18));

    }

    @Mock
    StudentDao dao;

    @InjectMocks
    StudentService studentService;

    @Before
  public  void init() {
        MockitoAnnotations.initMocks(dao);
    }

    @Test
    public void testMockito(){

        // 如果Dao还没有开发好，可以使用这个创建返回值
        Mockito.when(dao.getStudentById(10)).thenReturn(new Student(20,18,"Hello"));
        Student student = studentService.getStudentById(10);
        Assert.assertNotNull(student);
        Assert.assertEquals(student.getName(),"Hello");
        Assert.assertEquals(student.getAge(),new Integer(18));

    }





}