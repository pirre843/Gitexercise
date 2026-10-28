package se.iths.pierre.github.model;

public class Book {


    private String title;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
