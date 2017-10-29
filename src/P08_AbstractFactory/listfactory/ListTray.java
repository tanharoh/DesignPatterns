package P08_AbstractFactory.listfactory;

import java.util.Iterator;

import P08_AbstractFactory.factory.Item;
import P08_AbstractFactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n").append(caption).append("\n<ul>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</ul>\n</li>\n");
        return buffer.toString();
    }
}
