public class Author {
    private String name;
    private int birthYear;

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "Ім'я: " + name + "Рік народження: " + birthYear;
    }
}
