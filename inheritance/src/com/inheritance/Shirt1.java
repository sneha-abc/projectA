package com.inheritance;

public class Shirt1 {
    public String size;       // public
    String color;             // default
    protected int price;      // protected
    private boolean isIroned; // private

    public void setIroned(boolean isIroned) {
        this.isIroned = isIroned;
    }

    public boolean getIroned() {
        return isIroned;
    }

    private void material() {//private method
        System.out.println("The shirt is made of cotton");
    }

    void brand() {//default package method
        System.out.println("The shirt brand is FashionWear");
    }

    protected void discount() {//protected method
        System.out.println("The shirt is available at a 10% discount");
    }

    public static void main(String[] args) {
        Shirt1 shirt1 = new Shirt1();

    }
}

