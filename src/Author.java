public class Author {
    private String name;
    private int birthYear;

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }


    public void getInfo() {
        System.out.println("Ім'я: " + name + "Рік народження" + birthYear);
    }
}
