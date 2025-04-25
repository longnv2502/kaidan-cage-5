package models;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public Bird() {
    }

    void sing() {
        System.out.println(this.name + " chirping");
    }

    void fly() {
        System.out.println(this.name + " have flown");
    }
}
