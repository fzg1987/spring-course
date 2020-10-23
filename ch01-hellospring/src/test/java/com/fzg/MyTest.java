package com.fzg;

import com.fzg.service.SomeService;
import com.fzg.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01() {
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }
    @Test
    public void test02() {
        //使用spring容器创建的对象
        //1. 使用spring配置文件的名称
        String config = "beans.xml";
        //2. 创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示spring容器，通过容器就可以获取对象了，
        //ClassPathXmlApplicationContext：表示从类路径中加载spring的配置文件。
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，需要调用对象的方法
        //getBean("配置文件中的bean的id值");
        SomeService service = (SomeService) ac.getBean("someService");
        //使用spring创建好的对象
        service.doSome();
    }
}
