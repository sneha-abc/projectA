package com.Casting.ClassTypeCasting;

public class Facebook extends Meta {

    Boolean postAvailable=true;

    @Override
    public void message() {
        System.out.println(" can send messages in facebook");
    }

    @Override
    public void status() {
        System.out.println("updating status is available in facebook");
    }

    public void profile(){
        System.out.println("we can create a user profile");
    }
}
