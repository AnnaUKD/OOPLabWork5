import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private int age;
    private List<Book> rentedBooks = new ArrayList<>();

    public Reader(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void registration() {
        System.out.println("Вітаю, " + name + "! Ви зареєструвалися.");
    }

    public void rentBook(Book book) {
        rentedBooks.add(book);
        System.out.println(name + " орендував(ла) книгу: " + book.getTitle());
    }

    public void listRentedBooks() {
        if (rentedBooks.isEmpty()) {
            System.out.println("Немає орендованих книг.");
        } else {
            for (Book book : rentedBooks) {
                System.out.println(book.getInfo());
            }
        }
    }
}