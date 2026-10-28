package se.iths.pierre.github.model;

public class Movie {

    String title;
    int releaseYear;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
