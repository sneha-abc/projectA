package com.Operations;

public class BikeRunner {
    Bike[] bikes = new Bike[10];
    public static void main(String[] args)
    {
        BikeRunner runner=new BikeRunner();

        System.out.println("object1");
        Bike bike1=new Bike(258.3,"honda","BY098M3","Sagar");
        System.out.println(runner.saveDetails(bike1));
        Bike b1=runner.fetchDetailsByBikeNumber("BY098M3");
        System.out.println(b1.toString());

        System.out.println(runner.updateNameByBikeNumber("BY098M3","activa"));
        System.out.println(b1.toString());


        System.out.println("object 2");
        Bike bike2=new Bike(7856.3,"yamaha","TH9878M3","Sujay");
        System.out.println(runner.saveDetails(bike2));
        Bike b2=runner.fetchDetailsByBikeNumber("TH9878M3");
        System.out.println(b2.toString());

        System.out.println("object 3");
        Bike bike3=new Bike(4545.3,"pulse","TR9878M3","rohit");
        System.out.println(runner.saveDetails(bike3));
        Bike b3=runner.fetchDetailsByBikeNumber("TR9878M3");
        System.out.println(b3.toString());


        System.out.println("object 4");
        Bike bike4=new Bike(7845.3,"pulse","KS4789M3","rohit");
        System.out.println(runner.saveDetails(bike4));
        Bike b4=runner.fetchDetailsByBikeNumber("KS4789M3");
        System.out.println(b4.toString());

        System.out.println("object 5");
        Bike bike5=new Bike(555.3,"ktm","TM2596M3","jim");
        System.out.println(runner.saveDetails(bike5));
        Bike b5=runner.fetchDetailsByBikeNumber("TM2596M3");
        System.out.println(b5.toString());


        System.out.println("object 6");
        Bike bike6=new Bike(486235.3,"royal enfield","AS596M3","mike");
        System.out.println(runner.saveDetails(bike6));
        Bike b6=runner.fetchDetailsByBikeNumber("AS596M3");
        System.out.println(b6.toString());

        System.out.println("object 7");
        Bike bike7=new Bike(96235.3,"apache","WX296M3","will");
        System.out.println(runner.saveDetails(bike7));
        Bike b7=runner.fetchDetailsByBikeNumber("WX296M3");
        System.out.println(b7.toString());


        System.out.println("object 8");
        Bike bike8=new Bike(32585.3,"BMW","WX278FR3","ram");
        System.out.println(runner.saveDetails(bike8));
        Bike b8=runner.fetchDetailsByBikeNumber("WX278FR3");
        System.out.println(b8.toString());


        System.out.println("object 9");
        Bike bike9=new Bike(48585.3,"ducati","EWR8FR3","Arun");
        System.out.println(runner.saveDetails(bike9));
        Bike b9=runner.fetchDetailsByBikeNumber("EWR8FR3");
        System.out.println(b9.toString());

        System.out.println("object 10");
        Bike bike10=new Bike(6585.3,"ather","QWS8FR8","hopper");
        System.out.println(runner.saveDetails(bike10));
        Bike b10=runner.fetchDetailsByBikeNumber("QWS8FR8");
        System.out.println(b10.toString());





    }
    public boolean saveDetails(Bike bike)
    {
        boolean isSaved=false;
        for(int i=0;i< bikes.length;i++)
        {
            if(bikes[i]==null)
            {
                bikes[i]=bike;
                isSaved=true;
                break;
            }
        }
        return isSaved;
    }
    public Bike fetchDetailsByBikeNumber(String bikeNumber)
    {
        for(int i=0;i<bikes.length;i++)
        {
            if(bikes[i].getBikeNumber()==bikeNumber)
            {
                return bikes[i];
            }
        }
        return null;
    }
    public boolean updateNameByBikeNumber(String bikeNumber,String name)
    {
        for(int i=0;i< bikes.length;i++)
        {
            if(bikes[i].getBikeNumber()==bikeNumber)
            {
                bikes[i].setName(name);
                return true;
            }
        }
        return false;
    }
    public boolean deleteDetails(String buyerName)
    {
        for(int i=0;i< bikes.length;i++)
        {
            if(bikes[i].getBuyerName()==buyerName)
            {
                bikes[i] = null;
                return true;
            }
        }
        return false;
    }

}
