package implementatonClass;

import interfacee.Substraction;

public class SubstrationImpli implements Substraction {
    @Override
    public int sub(int a, int b) {
        int c= a-b;
        return c;
    }
}
