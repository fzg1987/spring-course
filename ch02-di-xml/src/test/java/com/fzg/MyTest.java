package com.fzg;

import com.fzg.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01() {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取student对象
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("Student对象："+myStudent);

        Date date = (Date)ac.getBean("myDate");
        System.out.println("当前日期："+date);
    }
}
