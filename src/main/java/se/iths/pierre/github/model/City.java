package se.iths.pierre.github.model;

public class City {
    private String name;
    private int population;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
