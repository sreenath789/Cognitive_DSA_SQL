package org.example.Question_19_oops.Polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}
