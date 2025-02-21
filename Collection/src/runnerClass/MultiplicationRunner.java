package runnerClass;

import interfacee.Multiplication;

public class MultiplicationRunner {
    public static void main(String[] args)
    {
        Multiplication mul = (int a, int b )-> a*b;
        int result = mul.mul(2,8)  ;
        System.out.println(result);
    }
}
