package com.njit.mockito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @auther zhuyoude
 * @Date 2020/5/8 9:00
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer id;

    private Integer age;

    private String name;

}
