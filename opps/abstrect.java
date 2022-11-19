package opps;

public class abstrect {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chiken c = new Chiken();
        c.eat();
        c.walk();

        // Animal a = new Animal()  we cannot create abstrect class object
    }
}

abstract class Animal {
    String color;
     Animal(){
        color = "brown";
     }
    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chiken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}