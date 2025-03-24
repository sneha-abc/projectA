package lamda;

import dto.ProductDto;

import java.util.HashSet;
import java.util.Set;

public class ProductSetRunner {

    public static void main(String[] args) {



        ProductDto p97 =  new ProductDto("MTSA1005NNNDB","MOTOROLA 10 kg 5 star rating Midnight Series Semi Automatic Top Load Washing Machine Black ","MOTOROLA",10589,1999);
        ProductDto p98 =  new ProductDto("EO25LG","Voltas Beko 20 L 700 W Smart Solo Microwave Oven ","iBELL",9855,1500);
        ProductDto p99 =  new ProductDto("NOIC4SM89I","iBELL 25-Litre Oven Toaster Grill ","Samsung",1799,1999);
        ProductDto p100 =  new ProductDto("NOIC4SM89I","iBELL 25-Litre Oven Toaster Grill ","Samsung",1799,1999);

        Set<ProductDto> productDtos=new HashSet<>();
        productDtos.add(p97);
        productDtos.add(p98);
        productDtos.add(p99);
        productDtos.add(p100);

        System.out.println("Total Products :"+productDtos.size());


    }
}
