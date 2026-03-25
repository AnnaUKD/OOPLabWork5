import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books =  new ArrayList<>();
    private List<Reader> readers =  new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getTitle().equals(book.getTitle()) && b.getAuthor().getName().equals(book.getAuthor().getName())) {
                System.out.println("Книга вже існує в бібліотеці: " + book.getTitle());
                return;
            }
        }
        books.add(book);
    }

    public Book removeBook(String title) {
        Book book = books.stream().filter(b -> b.getTitle().equals(title)).findFirst().orElse(null);
        if(book != null) {
            books.remove(book);
            System.out.println("Книгу видалено: " + title);
        }
        return book;

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
            if (book.getTitle().contains(title)) {
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
            if (book.getYear() == Integer.parseInt(desiredBookToFind)) {
                JOptionPane.showMessageDialog(null, book.getInfo(), "Книгу знайдено", JOptionPane.INFORMATION_MESSAGE);
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Книгу не знайдено", "Помилка", JOptionPane.ERROR_MESSAGE);
        }
    }


    public void registerReader(Reader reader) {
        readers.add(reader);
    }


    public List<Reader> getAllReader() {
        return readers;
    }

    public void serveBook(Reader reader, String title) {
        Book b = removeBook(title);
        if (b != null) {
            reader.rentBook(b);
        } else {
            System.out.println("немає в наявності книги: " + title);
        }


    }
}