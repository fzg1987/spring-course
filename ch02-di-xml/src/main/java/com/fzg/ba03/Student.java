package com.fzg.ba03;

public class Student {
    private String name;
    private int age;

    //声明一个引用类型
    private School school;

    public void setSchool(School school) {
        System.out.println("setSchool:"+school);
        this.school = school;
    }

    public Student(){
        System.out.println("spring会调用类的无参数构造方法创建对象");
    }

    /**
     * 创建有参数构造方法
     * @param myName    姓名
     * @param myAge     年龄
     * @param mySchool  学校
     */
    public Student(String myName, int myAge, School mySchool){
        System.out.println("Student类有参数构造方法========");
        //属性赋值
        this.name=myName;
        this.age=myAge;
        this.school=mySchool;
    }

    public void setName(String name){
        System.out.println("setName:"+name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge:"+age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
