package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalRunner {

    public static void main(String[] args) {


     Optional<String> optional=   getNameByIndex(20);
        if(optional.isPresent())
        {
            System.out.println("data is present in optional"+optional.get());
        }
        else{
            System.out.println("data is not present in optional");
        }

    }


    public static Optional<String> getNameByIndex(int index)
    {
        List<String> names=new ArrayList<>();
        names.add("om");
        names.add("sujay");
        names.add("sneha");
        names.add("devendra");
        names.add("prasad");

        try {
            String name = names.get(index);
            return Optional.of(name);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException)
        {
            System.err.println("index not found");
        }
        return  Optional.empty();

    }


}
