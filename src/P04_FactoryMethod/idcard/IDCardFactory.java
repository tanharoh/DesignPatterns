package P04_FactoryMethod.idcard;

import P04_FactoryMethod.framework.Factory;
import P04_FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author ilyar on 17-10-23
 */
public class IDCardFactory extends Factory{
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
