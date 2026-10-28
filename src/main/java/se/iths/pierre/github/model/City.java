package se.iths.pierre.github.model;

public class City {
    private String name;
    private int population;

    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
