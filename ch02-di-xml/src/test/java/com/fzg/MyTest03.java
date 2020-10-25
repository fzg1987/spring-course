package com.fzg;

import com.fzg.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {
    @Test
    public void test01() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取student对象
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("Student对象："+myStudent);

    }
    @Test
    public void test02() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取student对象
        Student myStudent = (Student) ac.getBean("myStudent2");
        System.out.println("Student对象："+myStudent);
    }
    @Test
    public void test03() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        File myFile = (File) ac.getBean("myFile");
        System.out.println("myFile====="+myFile.getName());
    }

}
