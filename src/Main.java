import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ліна Костенко", 1930);
        Author author2 = new Author("Іван Франко", 1856);

        Book book1 = new Book("Маруся Чурай", author1, 1979, "Історичний роман у віршах.");
        Book book2 = new Book("Захар Беркут", author2, 1883, "Повість про захист Карпат.");
        Book book3 = new Book("Каменярі", author2, 1878, "");


        Library library = new Library("Міська бібліотека", new ArrayList<>());

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("=== Всі книги ===");
        library.listBooks();


        System.out.println("=== Книги Івана Франка ===");
        List<Book> found = library.findBooksByAuthor("Іван Франко");
        for (Book b : found) {
            System.out.println(b.getInfo());
        }
    }
}