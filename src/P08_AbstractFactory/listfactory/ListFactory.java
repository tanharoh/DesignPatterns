package P08_AbstractFactory.listfactory;

import P08_AbstractFactory.factory.Factory;
import P08_AbstractFactory.factory.Link;
import P08_AbstractFactory.factory.Page;
import P08_AbstractFactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return null;
    }

}
