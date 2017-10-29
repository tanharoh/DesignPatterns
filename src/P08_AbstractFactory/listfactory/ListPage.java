package P08_AbstractFactory.listfactory;

import P08_AbstractFactory.factory.Item;
import P08_AbstractFactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n<h1>").append(title).append("</h1>\n<ul\n>");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
