package com.collection.arraylist.linkedlist;

public class MobileRunner {
    public static void main(String[] args) {
//        Mobile mobile =new Mobile(){//it is a bylapcode/waste code -it is called as ananymous class
//            @Override
//            public String mobileId(){
//                return "hello lamda";
//            }
//        };
//        System.out.println(mobile.mobileId());
//        Mobile mobile1 = ()->"hello world";//lamda expression which reduce the code mentiond above,//it a functional method
//        System.out.println(mobile1.mobileId());


        Mobile mobile = (a) -> a + 10;
        int result = mobile.mobileId(40);
        System.out.println(result);//consumer interface -expression which have at least one parameter


        Mobile mobile1 = (b) -> b  ;
        int result1 = mobile.mobileId(40);
        System.out.println(result1);

      
    }
}
