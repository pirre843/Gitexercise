package se.iths.pierre.github.model;

public class Animal {
    private String name;
    private String species;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Animal name:  " + "," + " species:  ";
    }
}
