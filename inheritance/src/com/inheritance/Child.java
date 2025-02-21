package com.inheritance;

 class Child extends Parent{
    protected String hobby;
    int grade;

    public Child(){
        System.out.println("non parameterized child class constructor");
    }

    public Child(String hobby , int grade){
        System.out.println("parameterized Child class constructor");
        this.hobby=hobby;
        this.grade=grade;
    }

    public String getHobby(){
        return hobby;
    }


    public int getGrade() {
        return grade;
    }

    public void schoolName(){
        System.out.println("school name is KLE");
    }

    public  static void main(String[] args){
        Child child = new Child();//non parameterized child class constructor
        Child child1 = new Child("dance" ,10);// parameterized child class constructor

        System.out.println(child1.getHobby());
        System.out.println(child1.getGrade());
        child.schoolName();

        Parent parent = new Parent();// non parameterized parent class constructor
        Parent parent1 = new Parent("teacher", 3000);// parameterized parent class constructor

        System.out.println(parent1.getProfession());
        System.out.println(parent1.getSalary());
        parent.surName();

        GrandParent grandParent = new GrandParent();//non parameterized GrandParent class constructor
        GrandParent grandParent1 = new GrandParent(80,"jim");//parameterized grandparent  class constructor

        System.out.println(grandParent1.getAge());
        System.out.println(grandParent1.getName());
        grandParent.familyHome();



    }
}
