import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Library {
    private String title;
    private List<Book> books;

    public Library(String name, List<Book> books) {
        this.title = title;
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
    }

    public List<Book> findBooksByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equals(authorName)) {
                result.add(book);
            }
        }
        return result;
    }


    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.contains(title)){
               return book;
            }
        }
        return null;
    }

    public void findBookByYear() {
        String desiredBookToFind = JOptionPane.showInputDialog(
                null, "Введіть рік видання книжки, яку ви хочете знайти", JOptionPane.QUESTION_MESSAGE
        );


        for (Book book : books) {
            if (book.year == Integer.parseInt(desiredBookToFind)){
                JOptionPane.showMessageDialog(null, book.getInfo(), "Книгу знайдено", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}