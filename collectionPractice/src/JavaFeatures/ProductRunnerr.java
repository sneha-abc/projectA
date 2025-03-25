package JavaFeatures;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRunnerr {

    public static void main(String[] args) {
        List<ProductDto> productDtos= new ArrayList<>();
        ProductDto productDto1=new ProductDto("laptop","electronics",50000);
        ProductDto productDto2=new ProductDto("mobile","electronics",1200);
        ProductDto productDto3=new ProductDto("t-shit","cloth",500);
        ProductDto productDto4=new ProductDto("bag","accessories",2500);
        ProductDto productDto5=new ProductDto("neck chain","accessories",3000);
        ProductDto productDto6=new ProductDto("chocolate","food",400);
        ProductDto productDto7=new ProductDto("spectacles","accessories",5000);
        ProductDto productDto8=new ProductDto("nike","shoes",6000);
        ProductDto productDto9=new ProductDto("bag","accessories",4000);
        ProductDto productDto10=new ProductDto("fan","electronics",1000);

        productDtos.add(productDto1);
        productDtos.add(productDto2);
        productDtos.add(productDto3);
        productDtos.add(productDto4);
        productDtos.add(productDto5);
        productDtos.add(productDto6);
        productDtos.add(productDto7);
        productDtos.add(productDto8);
        productDtos.add(productDto9);
        productDtos.add(productDto10);


        System.out.println("printing all the products of type electronics=================");
        List<ProductDto> types = productDtos.stream().filter(x->x.getType().equals("electronics")).collect(Collectors.toList());
        for (ProductDto type : types) {
            System.out.println(type.getProductName());
        }

        System.out.println("printing all the products whose price is > 10000=======================");
       List<ProductDto> productDtos1 = productDtos.stream().filter(x->x.getPrice()>10000).sorted().collect(Collectors.toList());
        for (ProductDto productDto : productDtos1) {
            System.out.println(productDto.getProductName());
        }

        System.out.println("printing all the product name");
        List<String> productDto = productDtos.stream().map(x->x.getProductName()).collect(Collectors.toList());
        System.out.println(productDto);

        System.out.println("printing all the product price============================");
        List<Integer> price = productDtos.stream().map(x->x.getPrice()).collect(Collectors.toList());
        System.out.println(price);

        System.out.println("getting product by type====================");
List<ProductDto> getProductByType= productDtos.stream().filter(x->x.getType().equals("food")).collect(Collectors.toList());
        for (ProductDto dto : getProductByType) {
            System.out.println(dto.getProductName());
        }

        System.out.println("printing all the values with asc order of price");
        List<Integer> asc = productDtos.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
        System.out.println(asc);

        System.out.println("printing all the values in desc order of price");
        Comparator<ProductDto> productInDesc =(a,b)->Integer.compare(b.getPrice(),a.getPrice());
        List<ProductDto> desc=productDtos.stream().sorted(productInDesc).collect(Collectors.toList());
        for (ProductDto dto : desc) {
            System.out.println(dto.getProductName());
        }

    }
}
