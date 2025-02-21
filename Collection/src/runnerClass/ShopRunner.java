package runnerClass;

import interfacee.Shop;

public class ShopRunner {
    public static void main(String[] args) {
        Shop s =(String a)->"fruit shop";
        String s1 = s.shopName("fruit shop");
        System.out.println(s1);
    }
}
