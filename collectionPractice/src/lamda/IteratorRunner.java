package lamda;

import dto.ProductDto;
import runner.ProductRunner;

import java.util.Collection;
import java.util.Iterator;

public class IteratorRunner {

    public static void main(String[] args) {


        Collection<ProductDto> productDtos= ProductRunner.getProductDTOs();

        System.out.println("before removing total elements :"+productDtos.size());

        //hasNext,next,remove,forEachRemaining
                  Iterator<ProductDto> itr= productDtos.iterator();

                  while(itr.hasNext())
                  {
                      ProductDto productDto= itr.next();
                      if(productDto.getDiscount()>500)
                      {
                          itr.remove();
                      }
                  }
        System.out.println("AFTER removing total elements :"+productDtos.size());

    }
}
