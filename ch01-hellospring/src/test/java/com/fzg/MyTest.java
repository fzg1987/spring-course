package com.fzg;

import com.fzg.service.SomeService;
import com.fzg.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Clock;
import java.util.Date;

public class MyTest {

    @Test
    public void test01() {
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }

    /**
     * spring默认创建对象的时间，是创建spring容器时，会创建配置文件中的所有对象。
     * spring创建对象，默认创建的是无参数的对象
     */
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
    /**
     *  获取spring容器中java对象的信息
     */
    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring中提供的方法，获取容器中定义的对象
        int numbers = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量：" + numbers);
        //容器中每个定义的对象的名称
        String names[] = ac.getBeanDefinitionNames();
        for(String name: names){
            System.out.println(name);
        }
    }

    /**
     * 使用一个非自定义类创建的对象
     */
    @Test
    public void test04() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用getBean
        Date my = (Date) ac.getBean("mydate");
        System.out.println("Date:"+my);
    }
}
