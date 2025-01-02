package com.loop;

public class Loop2 {
    public static void main(String[] args){

        String light="green";


        if(light=="red" && light!="yellow" && light!="green"){

            System.out.println("stop the vehicle");

        }else if(light!="red" && light=="yellow" && light!="green"){

            System.out.println("start the vehicle");

        }else  {

            System.out.println("move the vehicle");
        }


    }
}
