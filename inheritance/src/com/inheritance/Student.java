package com.inheritance;

public class Student extends Person{
    String studentId;

    public Student()
    {
        System.out.println("Non parametrized child  constructor");
    }
    public Student(String name,int age,String studentId)
    {
        super(name, age);
        this.studentId=studentId;
        System.out.println("Parametrized child  constructor");
    }
    public String getStudentId()
    {
        return studentId;
    }
    public static void main(String[] args)
    {
        Student stu = new Student();
        Student stu1= new Student("sneha",22,"SI01");
        Person per = new Person();
        Person per1 = new Person("sagar",19);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getStudentId());
        System.out.println(per1.getName());
        System.out.println(per1.getAge());
        per1.setGender("male");
        System.out.println(per1.getGender());
    }
}
