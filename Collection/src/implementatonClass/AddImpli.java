package implementatonClass;

import interfacee.Addition;

public class AddImpli implements Addition {
    @Override
    public int sum(int a, int b) {
        int c=a+b;
        return c;
    }
}
