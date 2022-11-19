package opps;

public class inheritance {

    public static void main(String args[]) {
        // Fish shark = new Fish();
        Dog moti = new Dog();
        moti.eat();
        moti.legs = 4;
        System.out.println(moti.legs);
        // shark.eat();
    }

    public static class Animal {
        String color;

        void eat() {
            System.out.println("Eats");
        }

        void breathe() {
            System.out.println("Breathe");
        }
    }

    // // Derive class
    // public static class Fish extends Animal {
    // int fins;

    // void swim() {
    // System.out.println("Swims in Water");
    // }
    // }

    public static class Mammals extends Animal {
        int legs;
    }

    public static class Dog extends Mammals {
        String breathe;
    }

}
