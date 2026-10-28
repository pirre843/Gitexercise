package se.iths.pierre.github;

import se.iths.pierre.github.model.Animal;
import se.iths.pierre.github.model.Car;
import se.iths.pierre.github.model.City;

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
    }

}
