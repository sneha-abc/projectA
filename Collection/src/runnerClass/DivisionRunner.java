package runnerClass;

import interfacee.Division;

public class DivisionRunner {
    public static void main(String[] args)
    {
        Division div = (int a, int b)-> a/b;
        float result = div.divison(40,10);
        System.out.println(result);
    }
}
