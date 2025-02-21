package com.enu;

public class Days {

    private Week day;//we declare day to type of enum week

    public void setDay(Week day) {  //to set the day we use setters
        this.day = day;
    }
    public Week getDay() {
        return day;
    }


    public void daySelector(){     //method to select the corresponding days
        switch (day){//we are sending day as a condition
            case Monday: System.out.println("Day is Monday");
                break;

            case Tuesday: System.out.println("Day is Tuesday");
                break;

            case Wednesday: System.out.println("Day is Wednesday");
                break;

            case Thursday: System.out.println("Day is Thursday");
                 break;

            case Friday: System.out.println("Day is friday");
                break;

            case Saturday: System.out.println("Day is Saturday");
                break;

            case Sunday: System.out.println("Day is sunday");
                break;

        }
    }
}
