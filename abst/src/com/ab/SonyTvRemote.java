package com.ab;

public class SonyTvRemote implements Remote{
    private String powerButton;
    private String channel;

    SonyTvRemote(String channel, String powerButton){
        this.channel=channel;
        this.powerButton=powerButton;
    }
    public String powerButtonSwitching(){
        System.out.println("power button in sony is switched to"+powerButton);
        return powerButton;
    }
    public String channelChange() {
        System.out.println("in sony remote channel is changed to " + channel);
        return channel;
    }


}
