package P03_TemplateMethod;

/**
 * Created by @author ilyar on 17-10-21
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay h = new CharDisplay('H');
        AbstractDisplay hello = new StringDisplay("Hello");

        h.display();
        hello.display();

    }
}
