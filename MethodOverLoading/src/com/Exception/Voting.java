package com.Exception;

public class Voting {
    int age;
    public Voting(int age)
    {
     this.age=age;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args)
    {
        Voting vote=new Voting(16);
        if(vote.getAge()>18)
        {
            System.out.println("eligible for voting");
        }
        else {
            throw new NotEligibleException("not eligible for voting because age is less than 18");//we are sending message to exception class
        }
    }
}
