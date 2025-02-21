package com.Exception;

public class Size {
    String sizeOfShirt;

    public Size(String sizeOfShirt){
        this.sizeOfShirt=sizeOfShirt;
    }
    public String getSizeOfShirt(){
        return sizeOfShirt;
    }
    public static void main(String[] args){
        Size size= new Size("S");
        String acutalSize="M";
        if(size.getSizeOfShirt()==acutalSize){
            System.out.println("the size is matching");
        }
        else{
            throw new SizeException("Size not matching");
        }
    }
}
