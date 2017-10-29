package P08_AbstractFactory.listfactory;

import P08_AbstractFactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        return null;
    }
}
