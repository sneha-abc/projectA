package com.inheritance;

public class Food {
    String name;
    double calories;
    int cost;

    public Food()
    {
        //default super() Statment
        System.out.println("Non parameterised constructor");
    }

    public Food(String name, double calories) {
        this();
        System.out.println("parmeterized constructor ");
        this.name = name;
        this.calories = calories;
    }

    public void setCost(int cost)
    {
        this.cost=cost;
    }
    public String getName()
    {
        return name;
    }
    public double getCalories()
    {
        return calories;
    }
    public int getCost()
    {
        return cost;
    }
}


