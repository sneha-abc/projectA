package com.inheritance;

public class WashingMachine extends Appliances{
    int drumSize;

    public WashingMachine()
    {
        System.out.println("Non parametrized child  constructor");
    }
    public WashingMachine(String brand ,String powerSource ,int drumSize)
    {
        super(brand,powerSource);
        this.drumSize=drumSize;
        System.out.println("Parametrized child  constructor");
    }
    public int getDrumSize()
    {
        return drumSize;
    }
    public static void main(String[] args){
        WashingMachine wm = new WashingMachine();
        WashingMachine wm1 = new WashingMachine("LG","Electric",20);
        Appliances app = new Appliances();
        Appliances app1 = new Appliances("abc","electric");
        System.out.println(wm1.getBrand());
        System.out.println(wm1.getPowerSource());
        System.out.println(wm1.getDrumSize());
        System.out.println(app1.getBrand());
        System.out.println(app1.getPowerSource());
        app1.setCapacity(100);
        System.out.println(app1.getCapacity());
    }
}
