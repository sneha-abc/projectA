package com.inheritance;

public class Pizza extends Food {
    String toppings;

    public Pizza()
    {
        System.out.println("Non parametrized child  constructor");
    }
    public Pizza(String name,double calories,String toppings)
    {
        super(name, calories);
        this.toppings=toppings;
        System.out.println("Parametrized child  constructor");
    }
    public String getToppings()
    {
        return toppings;
    }
    public static void main(String[] args)
    {
        Pizza piz = new Pizza();//non parameterized child constructor
        Pizza piz1= new Pizza("chess",20.87,"abc");//parameterized child constructor
        Food food = new Food();//non parameterized parent constructor
        Food food1 = new Food("dosa",12.7);// parameterized parent constructor
        System.out.println(piz1.getName());
        System.out.println(piz1.getCalories());
        System.out.println(piz1.getToppings());
        System.out.println(food1.getName());
        System.out.println(food1.getCalories());
        food1.setCost(70);
        System.out.println(food1.getCost());
    }
}
