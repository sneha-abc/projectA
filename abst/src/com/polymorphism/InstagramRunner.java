package com.polymorphism;

public class InstagramRunner {

    public static void main(String[] args){

        Instagram insta = new Instagram();

        insta.feature("post");

        insta.feature("post","hi");

        insta.feature("post","thursday","reels");
    }

}
