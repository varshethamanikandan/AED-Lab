package edu.neu.mgen;

    // Base class for all animals
class Animal {
    private String name;
    private String typicalSize;
    private String typicalWeight;
    private boolean predator; // true for predator, false for vegetarian

    public Animal(String name, String typicalSize, String typicalWeight, boolean predator) {
        this.name = name;
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.predator = predator;
    }

    public String getName() {
        return name;
    }

    public String getTypicalSize() {
        return typicalSize;
    }

    public String getTypicalWeight() {
        return typicalWeight;
    }

    public boolean isPredator() {
        return predator;
    }

    @Override
    public String toString() {
        return "Animal: " + name + ", Size: " + typicalSize + ", Weight: " + typicalWeight + ", Predator: " + predator;
    }
    
}

// Bird class
class Bird extends Animal {
    private String speciesName;
    private int wingspan; // in centimeters

    public Bird(String name, String speciesName, int wingspan, String typicalSize, String typicalWeight, boolean predator) {
        super(name, typicalSize, typicalWeight, predator);
        this.speciesName = speciesName;
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Species: " + speciesName + ", Wingspan: " + wingspan + "cm";
    }
}

// LandAnimal class
class LandAnimal extends Animal {
    private int numberOfLegs;

    public LandAnimal(String name, int numberOfLegs, String typicalSize, String typicalWeight, boolean predator) {
        super(name, typicalSize, typicalWeight, predator);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Legs: " + numberOfLegs;
    }
}

// Fish class
class Fish extends Animal {
    private int numberOfFins;

    public Fish(String name, int numberOfFins, String typicalSize, String typicalWeight, boolean predator) {
        super(name, typicalSize, typicalWeight, predator);
        this.numberOfFins = numberOfFins;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fins: " + numberOfFins;
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Bird pheonix = new Bird("Pheonix (Bird)", "Pterodroma alba", 500, "Small", "40g", false);
        LandAnimal zebra = new LandAnimal("Zebra (Land Animal)",4, "Medium", "200kg", true);
        Fish pomfret = new Fish("Pomfret (Fish)",  2, "Small", "0.5kg", false);

        System.out.println(pheonix);
        System.out.println(zebra);
        System.out.println(pomfret);
    }
}
    

