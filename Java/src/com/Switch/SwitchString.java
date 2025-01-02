package com.Switch;

public class SwitchString {
    public static void main(String[] args){

        String  apps = "netflix";

        switch (apps){

            case "whatsapp":
                System.out.println("1");
                break;

            case "instagram":
                System.out.println("2");
                break;

            case "netflix":
                System.out.println("3");
                break;

            case "linkedin":
                System.out.println("4");
                break;

            case "zoomMeeting":
                System.out.println("5");
                break;

            case "hotstar":
                System.out.println("6");
                break;

            case "googlePay":
                System.out.println("7");
                break;

            default:
                System.out.println("not valid");
        }
    }
}
