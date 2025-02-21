package com.enu;

enum Months {
      January("1st"),
      February("2nd"),
      March("3rd"),
      April("4th"),
      May("5th"),
      June("6th"),
      July("7th"),
      August("8th"),
      September("9th"),
      October("10th"),
      November("11th"),
      December("12th");

      private String order;

      Months(String order){
        this.order=order;

      }

    public String getOrder() {
        return order;
    }

    public static void main(String[] args) {

//        for(Months month:Months.values()){
//            System.out.println(month);
//        }
    }
  }