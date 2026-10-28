package se.iths.pierre.github;

import se.iths.pierre.github.model.*;

public class Main {
    static void main() {
        Car car1 = new Car("Volvo", "V90");
        Car car2 = new Car("VW", "Passat");

        Animal animal1 = new Animal("Apa", "chinpans");
        Animal animal2 = new Animal("Katt", "Bondkatt");

        City city1 = new City("London", 100000);
        City city2 = new City("Stockholm", 100000);

        IO.println(car1);
        IO.println(car2);

        IO.println(animal1);
        IO.println(animal2);

        IO.println(city1);
        IO.println(city2);


        Book book1 = new Book("Volvo", "Pelle Karlsson");
        Book book2 = new Book("Volkswagen", "Kalle Persson");
        IO.println(book1);
        IO.println(book2);


        Movie movie3 = new Movie("Skräck", 2006);
        Movie movie4 = new Movie("komedi", 2010);
        IO.println(movie3);
        IO.println(movie4);

        Game game4 = new Game("Fps", 18);
        Game game5 = new Game("Sport", 15);
        IO.println(game4);
        IO.println(game5);


    }

}
