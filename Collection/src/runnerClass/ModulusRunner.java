package runnerClass;

import interfacee.Modulus;

public class ModulusRunner {
    public static void main(String[] args)
    {
        Modulus mod = (int a, int b)-> a%b;
        float result = mod.modulos(10,50);
        System.out.println(result);
    }
}
