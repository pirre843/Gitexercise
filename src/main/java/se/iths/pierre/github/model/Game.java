package se.iths.pierre.github.model;

public class Game {

    private String name;
    int ageLimit;

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", ageLimit=" + ageLimit +
                '}';
    }
}
