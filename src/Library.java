import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.title.equals(book.title) && b.getAuthor().getName().equals(book.getAuthor().getName())) {
                System.out.println("Книга вже існує в бібліотеці: " + book.title);
                return;
            }
        }
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.title.equals(title));
        System.out.println("Книгу видалено: " + title);
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
            if (book.title.contains(title)) {
                return book;
            }
        }
        throw new RuntimeException("Книгу не знайдено: " + title);
    }

    public void findBookByYear() {
        String desiredBookToFind = JOptionPane.showInputDialog(
                null, "Введіть рік видання книжки", JOptionPane.QUESTION_MESSAGE
        );
        boolean found = false;
        for (Book book : books) {
            if (book.year == Integer.parseInt(desiredBookToFind)) {
                JOptionPane.showMessageDialog(null, book.getInfo(), "Книгу знайдено", JOptionPane.INFORMATION_MESSAGE);
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Книгу не знайдено", "Помилка", JOptionPane.ERROR_MESSAGE);
        }
    }
}