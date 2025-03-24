package lamda;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class SetRunner {

    public static void main(String[] args) {


        Set<Integer> integers=new LinkedHashSet<>();



        integers.add(34);
        integers.add(44);
        integers.add(32);
        integers.add(67);
        integers.add(90);
        integers.add(90);
        integers.forEach(i-> System.out.println(i));

        System.out.println("===");

         integers
                 .stream()
                 .filter(no->no>185)
                 .findFirst()
                 .ifPresent(integer -> System.out.println("optional" + integer));

    }
}
