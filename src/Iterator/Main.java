package Iterator;

/**
 * Created by ilyar on 17-10-18
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("Computer Network"));
        bookShelf.appendBook(new Book("Operating System"));
        bookShelf.appendBook(new Book("Machine Learning"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getBookName());
        }
    }
}
