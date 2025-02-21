package com.ab;

public class RemoteRunner {
    public static void main(String[] args){
        Remote sonyTvRemote=new SonyTvRemote("colours","on");

        String C= sonyTvRemote.channelChange();
        System.out.println(C);

        String P=sonyTvRemote.powerButtonSwitching();
        System.out.println(P);


        Remote samsungTvRemote= new SamsungTvRemote("publicTv","on");

        String c1 = samsungTvRemote.channelChange();
        System.out.println(c1);

        String p1 =samsungTvRemote.powerButtonSwitching();
        System.out.println(p1);


    }
}
