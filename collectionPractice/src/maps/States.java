package maps;

import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"Karnataka");
        map.put(2,"mumbai");
        map.put(3,"maharashtra");
        map.put(4,"kerala");
        map.put(5,"tamil nadu");
        map.put(6,"gujarat");
        map.put(7,"goa");
        map.put(8,"andhra pradesh");
        map.put(9,"punjab");
        map.put(10,"rajasthan");
        map.put(11,"telangana");
        map.put(12,"haryana");
        map.put(13,"bihar");
        map.put(14,"assam");
        map.put(15,"uttar pradesh");
        map.put(16,"odisha");
        map.put(17,"madhya pradesh");
        map.put(18,"jammu and kashmir");
        map.put(19,"uttarkhand");
        map.put(20,"manipur");
        System.out.println(map);

        System.out.println("To print the value using key!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        System.out.println(map.get(10));
        System.out.println(map.get(15));
        System.out.println(map.get(20));

        System.out.println("To print the key!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(map.keySet());

        System.out.println("To print the values!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(map.values());

        System.out.println("To clear the values!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        map.clear();
        System.out.println(map);

    }
    }

