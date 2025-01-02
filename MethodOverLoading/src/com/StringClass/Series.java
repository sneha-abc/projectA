package com.StringClass;

public class Series {
    public static void main(String [] args){
        //litteral string method
        String series ="Stranger Things";
        System.out.println(series);

        String series1 = "Stranger Things have 5 seasons";
        String series2 = "Stranger Things" ;
        String seriess="Stranger Things" +"series";

        //by object method

        String series3 = new String("Stranger Things");
        String series4 = new String("Stranger Things have 5 seasons");
        String series5 = new String("Stranger Things").intern();
        String series6 = new String("Stranger Things have 5 seasons").intern();


        System.out.println(series == series1);//f
        System.out.println(series == seriess);//f
        System.out.println(series == series2);//t
        System.out.println(series == series3);//f
        System.out.println(series2 == series5);//t
        System.out.println(series3 == series5);//f
        System.out.println(series1 == series6);//t
        System.out.println(series4 == series6);//f



    }
}
