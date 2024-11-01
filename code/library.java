import java.util.ArrayList;
import java.util.List;

public class library {
    private List<book> books;

    public library() {
        books = new ArrayList<>();
    }

    public void addbook(book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (book book : books) {
                System.out.println(book);
            }
        }
    }

    public void deleteBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book with ISBN " + isbn + " has been removed.");
    }
}
