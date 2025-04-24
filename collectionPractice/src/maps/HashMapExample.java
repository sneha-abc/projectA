package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Object,String> map = new HashMap();


        System.out.println("To add the values and key=====================================");
        map.put(418,"Karnataka");
        map.
        map.put(45,"mumbai");
        map.put(37,"maharashtra");
        map.put(4,"kerala");
        map.put(69,"tamil nadu");
        map.put(71,"gujarat");
        map.put(9,"goa");
        map.put(38,"andhra pradesh");
        map.put(48,"punjab");
        map.put(7,"rajasthan");
        map.put(18,"telangana");
        map.put(12,"haryana");
        map.put(17,"bihar");
        map.put(20,"assam");
        map.put(28,"uttar pradesh");
        map.put(29,"odisha");
        map.put(26,"madhya pradesh");
        map.put(80,"jammu and kashmir");
        map.put(30,"uttarkhand");
        map.put(60,"manipur");
        System.out.println(map);

        System.out.println("To print the value using key=====================================");
        System.out.println(map.get(18));
        System.out.println(map.get(20));
        System.out.println(map.get(418));
        System.out.println(map.get(60));
        System.out.println(map.get(17));

        System.out.println("To print the key=====================================");
        Set keys = map.keySet();


        System.out.println("To print the values using key set=====================================");
        for (Object key : keys) {
            System.out.println("key is"+key +"value is"+map.get(key));

        }

        System.out.println("To print the values usinng for =====================================");
        Set<Map.Entry<Object, String>> entry = map.entrySet();
        for (Map.Entry<Object, String> objectStringEntry : entry) {
            System.out.println("key is"+objectStringEntry.getKey()+"value is"+objectStringEntry.getValue());
        }

        Iterator<Map.Entry<Object, String>> entry1 = entry.iterator();
        while(entry1.hasNext())
        {
            Map.Entry<Object, String> state = entry1.next();
            System.out.println(state.getKey());
            System.out.println(state.getValue());

        }

        System.out.println("To print the values=====================================");
        System.out.println(map.values());

        System.out.println("To clear the values=====================================");
        map.clear();
        System.out.println(map);

    }
    }

