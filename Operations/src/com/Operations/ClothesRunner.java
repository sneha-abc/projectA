package com.Operations;

public class ClothesRunner {
    Clothes[] clothes=new Clothes[5];

    public static void main(String[] args) {
        ClothesRunner runner = new ClothesRunner();

        System.out.println("object 1");

        Clothes clothes1 = new Clothes(500,"T-shirt","s","max");
        System.out.println(runner.saveDetails(clothes1));
        Clothes c1 = runner.fetchDetailsByBrand("max");
        System.out.println(c1.toString());

        System.out.println(runner.updateTypeByBrand("max","crop-top"));
        System.out.println(c1.getType());
        System.out.println(c1.getType());
        System.out.println(c1.getSize());
        System.out.println(c1.getBrand());
        System.out.println(c1.getSize());

        System.out.println("object 2");

        Clothes clothes2 = new Clothes(600,"jeans","m","DNMX");
        System.out.println(runner.saveDetails(clothes2));
        Clothes c2 = runner.fetchDetailsByBrand("DNMX");
        System.out.println(c2.toString());


        System.out.println("object 3");

        Clothes clothes3 = new Clothes(400,"Shirt","m","Zara");
        System.out.println(runner.saveDetails(clothes3));
        Clothes c3 = runner.fetchDetailsByBrand("Zara");
        System.out.println(c3.toString());

        System.out.println("object 4");

        Clothes clothes4 = new Clothes(800,"hoodie","L","H&M");
        System.out.println(runner.saveDetails(clothes4));
        Clothes c4 = runner.fetchDetailsByBrand("H&M");
        System.out.println(c4.toString());


        System.out.println("object 5");

        Clothes clothes5 = new Clothes(900,"SweatShirt","M","Urbanic");
        System.out.println(runner.saveDetails(clothes5));
        Clothes c5 = runner.fetchDetailsByBrand("Urbanic");
        System.out.println(c5.toString());

    }

    public boolean saveDetails(Clothes cloth) {
        boolean isSaved = false;
        for (int i = 0; i <clothes.length; i++)
        {
            if(clothes[i]==null)
            {
                clothes[i]=cloth;
                isSaved=true;
                break;
            }
        }
        return isSaved;
    }
    public Clothes fetchDetailsByBrand(String brand){
        for(int i=0;i<clothes.length;i++)
        {
            if(clothes[i].getBrand()==brand)
            {
                return clothes[i];
            }
        }
        return null;
    }

    public boolean updateTypeByBrand(String brand,String type)
    {
        for(int i=0;i< clothes.length;i++)
        {
            if(clothes[i].getBrand()==brand)
            {
                clothes[i].setType(type);
                return true;
            }
        }
        return false;
    }

    public boolean deleteDetails(String brand)
    {
        for(int i=0;i< clothes.length;i++)
        {
            if(clothes[i].getBrand()==brand)
            {
                clothes[i] = null;
                return true;
            }
        }
        return false;
    }

}
