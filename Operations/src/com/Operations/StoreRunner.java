package com.Operations;

public class StoreRunner {
    Store[] stores = new Store[10];
    public static void main(String[] args)
    {
        StoreRunner runner=new StoreRunner();

        System.out.println("object1");

        Store store1=new Store(1,"fruit","vijaynagar","Sagar");
        System.out.println(runner.saveDetails(store1));
        Store s1=runner.fetchDetailsById(1);
        System.out.println(s1.toString());

        System.out.println(runner.updateNameById("sneha ",1));
        System.out.println(s1.getId());
        System.out.println(s1.getPlace());
        System.out.println(s1.getOwner());
        System.out.println(s1.getStoreType());


        System.out.println("object2");

        Store store2=new Store(2,"vegetables","attiguppe","rahul");
        System.out.println(runner.saveDetails(store2));
        Store s2=runner.fetchDetailsById(2);
        System.out.println(s2.toString());

        System.out.println("object3");

        Store store3=new Store(3,"mobile","rajajinagar","ram");
        System.out.println(runner.saveDetails(store3));
        Store s3=runner.fetchDetailsById(3);
        System.out.println(s3.toString());


        System.out.println("object4");

        Store store4=new Store(4,"homedecor","hampi nagar","jim");
        System.out.println(runner.saveDetails(store4));
        Store s4=runner.fetchDetailsById(4);
        System.out.println(s4.toString());

        System.out.println("object5");

        Store store5=new Store(5,"lenskart","majestic","mike");
        System.out.println(runner.saveDetails(store5));
        Store s5=runner.fetchDetailsById(5);
        System.out.println(s5.toString());


        System.out.println("object6");

        Store store6=new Store(6,"more","chandrea layout","lucus");
        System.out.println(runner.saveDetails(store6));
        Store s6=runner.fetchDetailsById(6);
        System.out.println(s6.toString());


        System.out.println("object7");

        Store store7=new Store(7,"stationry","kengeri","varun");
        System.out.println(runner.saveDetails(store7));
        Store s7=runner.fetchDetailsById(7);
        System.out.println(s7.toString());


        System.out.println("object8");

        Store store8=new Store(8,"trends","btm","rohit");
        System.out.println(runner.saveDetails(store8));
        Store s8=runner.fetchDetailsById(8);
        System.out.println(s8.toString());

        System.out.println("object9");

        Store store9=new Store(9,"jewallary","jayanagar","nancy");
        System.out.println(runner.saveDetails(store9));
        Store s9=runner.fetchDetailsById(9);
        System.out.println(s9.toString());


        System.out.println("object10");

        Store store10=new Store(10,"dmart","chikpete","sujay");
        System.out.println(runner.saveDetails(store10));
        Store s10=runner.fetchDetailsById(10);
        System.out.println(s10.toString());

    }
    public boolean saveDetails(Store store)
    {
        boolean isSaved=false;
        for(int i=0;i< stores.length;i++)
        {
            if(stores[i]==null)
            {
                stores[i]=store;
                isSaved=true;
                break;
            }
        }
        return isSaved;
    }
    public Store fetchDetailsById(int id)
    {
        for(int i=0;i<stores.length;i++)
        {
            if(stores[i].getId()==id)
            {
                return stores[i];
            }
        }
        return null;
    }
    public boolean updateNameById(String owner,int id)
    {
        for(int i=0;i< stores.length;i++)
        {
            if(stores[i].getOwner()==owner)
            {
                stores[i].setId(id);
                return true;
            }
        }
        return false;
    }
    public boolean deleteDetails(String owner)
    {
        for(int i=0;i< stores.length;i++)
        {
            if(stores[i].getOwner()==owner)
            {
                stores[i] = null;
                return true;
            }
        }
        return false;
    }

}