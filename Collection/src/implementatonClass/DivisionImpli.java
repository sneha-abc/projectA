package implementatonClass;

import com.sun.org.apache.xpath.internal.operations.Div;
import interfacee.Division;

public class DivisionImpli implements Division
{
    @Override
    public float divison(int a, int b) {

        float c=a/b;
        return c;
    }
}
