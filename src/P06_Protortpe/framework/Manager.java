package P06_Protortpe.framework;

import java.util.*;

public class Manager {
    private HashMap showCase = new HashMap();

    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) showCase.get(protoName);
        return p.createClone();
    }
}
