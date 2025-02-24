package com.StringArray;


class Count{
    public static void main(String[] args){
        int a = 251;
        int b =0;
        while(a>0){
           int c= (a/10);
           b++;
           a=c;
       //System.out.println(a);
        }
        System.out.println(b);
    }

}
