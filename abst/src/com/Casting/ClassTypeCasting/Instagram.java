package com.Casting.ClassTypeCasting;

public class Instagram extends Meta{
    boolean postAvailable=true;
    @Override
    public void message() {
        System.out.println("we can send message using instagram");
    }

    @Override
    public void status() {
        System.out.println("we can upload status using instagram");
    }

    public void reels(){
        System.out.println("we can create reels using instagram");
    }
}
