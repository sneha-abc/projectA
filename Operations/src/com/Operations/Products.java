package com.Operations;

public class Products {
    static String[] products=new String[5];//declaring array
    public static void main(String[] args) {

        Products products = new Products();//creating object


        System.out.println(products.save("laptop"));//saving laptop to index 0,gets saved
        System.out.println(products.fetchProducts("laptop"));//fetching laptop after saving to index 0,gets fetched

        System.out.println(products.fetchProducts("mobile"));//fetching mobile without saving to index 1,gets default value null
        System.out.println(products.save("mobile"));//saving mobile to index 1,gets saved
        System.out.println(products.fetchProducts("mobile"));//fetching mobile after saving to index 1,gets fetched
        System.out.println(products.updateProducts("battery",1));//updating mobile to battery to index 1,gets updated
        System.out.println(products.fetchProducts("battery"));//fetching the updated value battery


        System.out.println(products.save("headphones"));//saving headphones to index 2,gets saved
        System.out.println(products.fetchProducts("headphones"));//fetching headphones after saving to index 2,gets fetched
        System.out.println(products.deleteProducts("headphones"));//deleting the value ,gets deleted
        System.out.println(products.fetchProducts("headphones"));//fetching the deleted value ,gets null


        System.out.println(products.save("earphones"));//saving earphones to index 2,gets saved
        System.out.println(products.fetchProducts("earphones"));//fetching earphones after saving to index 2,gets fetched

        System.out.println(products.save("tab"));//saving tab to index 3,gets saved
        System.out.println(products.fetchProducts("tab"));//fetching tab after saving to index 3,gets fetched

        System.out.println(products.save("camera"));//saving camera to index 4,gets saved
        System.out.println(products.fetchProducts("camera"));//fetching camera after saving to index 4,gets fetched

        System.out.println(products.save("microphone")); //we can not save this value bec the values we can store in the given array is 4
        System.out.println(products.fetchProducts("microphone"));//if the value is not saved we can not fetch the value also
    }

        public boolean save(String product)
        {
            boolean isSaved=false;
            for(int i=0;i< products.length;i++)
            {
                if(products[i]==null)
                {
                    products[i]=product;
                    isSaved=true;
                    break;
                }
            }
            return isSaved;
        }

        public String fetchProducts(String product)
        {
            for(int i=0;i< products.length;i++)
            {
                if(products[i]==product)
                {
                    return products[i];
                }
            }
            return null;
        }
    public boolean updateProducts(String product,int i)
    {
        if(i<products.length)
        {
            products[i]=product;
            return true;
        }
        return false;
    }
    public boolean deleteProducts(String product)
    {
        boolean isDeleted=false;
        for(int i=0;i< products.length;i++)
        {
            if(products[i]==product)
            {
                products[i]=null;
                isDeleted=true;
                break;
            }
        }
        return isDeleted;
    }

    }



