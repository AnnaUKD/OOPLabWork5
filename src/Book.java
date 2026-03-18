public class Book {
    public String title;
    public Author author;
    public int year;
    public String annotation;

    public Book(String title, Author author, int year, String annotation) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.annotation = annotation;
    }


    public String getInfo() {
            return "Назва: " +  title + ", Рік видання: " + year + ", Автор: " + author.getName() + ", Анотація: " + annotation;
    }


    public Author getAuthor() {
        return author;
    }
}
