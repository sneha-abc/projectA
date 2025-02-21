package implementatonClass;

import interfacee.Multiplication;

public class MultiplicationImpli implements Multiplication {
    @Override
    public int mul(int a, int b ) {
        int d=a*b ;
        return d;
    }
}
