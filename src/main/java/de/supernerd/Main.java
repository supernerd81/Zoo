package de.supernerd;

public class Main {
    public static void main(String[] args) {
        Owner mm = new Owner("Michael Meyer", 45, "Franz-Müller-Straße 55");
        Species sp1 = new Species("Gorilla", 4556);
        Animal ape = new Animal(656, "Affe", sp1, 45, mm);

        Species sp2 = new Species("Terrier", 421);
        Owner fjm = new Owner("Franz Josef Müller", 23, "Franz-Mustermann-Straße 47");
        Animal dog = new Animal(66, "Hund", sp2, 15, fjm);

        System.out.println(ape);
        System.out.println(dog);
        System.out.println(ape.age());
        System.out.println(ape.id());
        System.out.println(dog.id());
        System.out.println(dog.age());
    }
}
