package com.njit.mockito;

import com.njit.mockito.model.Student;
import com.njit.mockito.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoApplicationTests {

    @Autowired
    StudentService studentService;

    @Test
    //  一般使用
    public void getStudentById() {
        Student student = studentService.getStudentById(2);
        System.out.println(student+"====");
//        Assert.assertNotNull(student);
//        Assert.assertEquals(student.getName(),"Tony");
//        Assert.assertEquals(student.getAge(),new Integer(18));

    }
    @Test
    public void contextLoads() {
    }

}
