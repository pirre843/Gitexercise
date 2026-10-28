package se.iths.pierre.github;

import se.iths.pierre.github.model.Book;
import se.iths.pierre.github.model.Movie;

public class Main {
    static void main() {

        Book book1 = new Book();
        Book book2 = new Book();

        Movie movie = new Movie();
        Movie movie2 = new Movie();

        Book book1 = new Book("Volvo", "Pelle Karlsson");
        Book book2 = new Book("Volkswagen", "Kalle Persson");
        IO.println(book1);
        IO.println(book2);


        Movie movie = new Movie("Skräck", "2006");
        Movie movie2 = new Movie("komedi", "2010");
        IO.println(movie);
        IO.println(movie2);

        Game game = new Game("Fps", "18");
        Game game1 = new Game("Sport", "15");
        IO.println(game);
        IO.println(game1);

    }

}
