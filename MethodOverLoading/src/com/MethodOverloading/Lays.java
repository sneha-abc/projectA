package com.MethodOverloading;

public class Lays {
        String brand;
        String type;
        int price;

        public void LaysInfo(String brand) {
            this.brand = brand;
        }

        public void LaysInfo(String brand, String type) {
            this.brand = brand;
            this.type = type;

        }

        public void LaysInfo(String brand, String type, int price) {
            this.brand = brand;
            this.type = type;
            this.price = price;

        }

        public String getBrand() {
            return brand;
        }

        public String getType() {
            return type;
        }

        public int getPrice() {
            return price;
        }
public void taste(){
            System.out.println("it taste good-parent class");
}


        public static void main(String[] args) {
             Lays lays = new Lays();

            lays.LaysInfo("bingo");
            System.out.println(lays.getBrand());

            lays.LaysInfo("bingo", "chilly");
            System.out.println(lays.getBrand());
            System.out.println(lays.getType());

            lays.LaysInfo("bingo", "chilly", 20);
            System.out.println(lays.getBrand());
            System.out.println(lays.getType());
            System.out.println(lays.getPrice());


        }

    }
