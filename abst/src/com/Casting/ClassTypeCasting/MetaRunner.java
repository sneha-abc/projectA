package com.Casting.ClassTypeCasting;

public class MetaRunner {
    public static void main(String[] args){

        System.out.println("upcasting=============================");

        Meta meta = new Facebook();
        meta.message();
        meta.status();

        System.out.println();
        System.out.println();


        System.out.println("downcasting===============================");

        if(meta instanceof Facebook){
            Facebook facebook = (Facebook) meta;//explicit casting
            System.out.println(facebook.postAvailable);
            facebook.message();
            facebook.status();
            facebook.profile();

        }

        if(meta instanceof Instagram){
            Instagram instagram = new Instagram();
            System.out.println(instagram.postAvailable);
            instagram.message();
            instagram.reels();
            instagram.status();
        }
    }

}
