package com.ab;

public class SamsungTvRemote implements Remote{
    private String powerButton;
    private String channel;

    SamsungTvRemote(String channel, String powerButton){
        this.channel=channel;
        this.powerButton=powerButton;
    }

    public String powerButtonSwitching(){
        System.out.println("power button in samsung is switched to"+powerButton);
        return powerButton;
    }

    public String channelChange() {
        System.out.println("in samsung remote channel is changed to " + channel);
        return channel;
    }

}
