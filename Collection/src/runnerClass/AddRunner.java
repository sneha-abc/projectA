package runnerClass;

import interfacee.Addition;

public class AddRunner {
    public static void main(String[] args)
    {
        Addition add = (int a, int b)-> a+b;
        int result = add.sum(1,2);
        System.out.println(result);
    }
}
