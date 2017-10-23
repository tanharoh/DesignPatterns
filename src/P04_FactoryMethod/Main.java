package P04_FactoryMethod;

import P04_FactoryMethod.framework.*;
import P04_FactoryMethod.idcard.*;

/**
 * Created by @author ilyar on 17-10-23
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("admin");
        Product card2 = factory.create("Bob");
        Product card3 = factory.create("Alice");

        card1.use();
        card2.use();
        card3.use();

    }
}
