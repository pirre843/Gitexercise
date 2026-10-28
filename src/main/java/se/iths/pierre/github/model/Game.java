package se.iths.pierre.github.model;

public class Game {

    private String name;
    private int ageLimit;

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", ageLimit=" + ageLimit +
                '}';
    }
}
