package P08_AbstractFactory.listfactory;

import P08_AbstractFactory.factory.Tray;

public class ListPage extends Tray {
    public ListPage(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        return null;
    }
}
