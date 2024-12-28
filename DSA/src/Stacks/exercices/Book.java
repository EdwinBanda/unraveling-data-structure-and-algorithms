package Stacks.exercices;

public class Book {
    private String isbn;
    private String Author;
    private String releaseYear;


    private  String name;

    public Book(){
        super();
    }
    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }


    public Book(String isbn, String author, String name) {
        this.isbn = isbn;
        Author = author;
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", Author='" + Author + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
