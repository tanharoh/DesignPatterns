package P06_Protortpe;

import P06_Protortpe.framework.Manager;
import P06_Protortpe.framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen ulPen = new UnderlinePen('-');
        MessageBox msgBox1 = new MessageBox('*');
        MessageBox msgBox2 = new MessageBox('/');
        manager.register("strong message", ulPen);
        manager.register("warning box", msgBox1);
        manager.register("slash box", msgBox2);

        Product p1 = manager.create("strong message");
        p1.use("Hi, how are you?");
        Product p2 = manager.create("warning box");
        p2.use("FBI WARNING");
        Product p3 = manager.create("slash box");
        p3.use("I am a slash box");


    }
}
