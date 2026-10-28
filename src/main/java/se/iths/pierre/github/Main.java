package se.iths.pierre.github;

import se.iths.pierre.github.model.Animal;
import se.iths.pierre.github.model.Car;
import se.iths.pierre.github.model.City;
import se.iths.pierre.github.model.Book;
import se.iths.pierre.github.model.Movie;

public class Main {
    static void main() {
        Car car1 = new Car("Volvo","V90");
        Car car2 = new Car("VW","Passat");

        Animal animal1 = new Animal("Apa","chinpans");
        Animal animal2 = new Animal("Katt", "Bondkatt");

        City city1 = new City("London", 100000);
        City city2 = new City("Stockholm", 100000);

        IO.println(car1);
        IO.println(car2);

        IO.println(animal1);
        IO.println(animal2);

        IO.println(city1);
        IO.println(city2);
        Book book1 = new Book();
        Book book2 = new Book();

        Movie movie = new Movie();
        Movie movie2 = new Movie();


    }

}
