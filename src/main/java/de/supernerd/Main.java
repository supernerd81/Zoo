package de.supernerd;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Owner mm = new Owner("Michael Meyer", 45, "Franz-Müller-Straße 55");
        Species sp1 = new Species("Gorilla", 4556);
        Animal ape = new Animal(656, "Affe", sp1, 45, mm);

        Species sp2 = new Species("Terrier", 421);
        Owner fjm = new Owner("Franz Josef Müller", 23, "Franz-Mustermann-Straße 47");
        Animal giraffe = new Animal(66, "Giraffe", sp2, 15, fjm);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(ape);
        animalList.add(giraffe);

        Zoo zoo = new Zoo(animalList);

        System.out.println(ape);
        System.out.println(giraffe);
        System.out.println(ape.age());
        System.out.println(ape.id());
        System.out.println(giraffe.id());
        System.out.println(giraffe.age());
    }
}
