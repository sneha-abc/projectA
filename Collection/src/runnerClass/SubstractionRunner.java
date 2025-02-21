package runnerClass;

import interfacee.Substraction;

public class SubstractionRunner {
    public static void main(String[] args)
    {
        Substraction sub = (int a, int b)-> a-b;
        int result = sub.sub(10,5);
        System.out.println(result);
    }
}
