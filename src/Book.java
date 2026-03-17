public class Book {
    private String name;
    private Author author;
    private int year;
    private String annotation;

    public Book(String name, Author author, int year, String annotation) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.annotation = annotation;
    }


    public String getInfo() {
            return "Назва: " +  name + ", Рік видання" + year + ", Автор: " + author + ", Анотація: " + annotation;
    }


    public Author getAuthor() {
        return author;
    }
}
