package models;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    void mew() {
        System.out.println(this.name + " mew mew");
    }

    void walk() {
        System.out.println(this.name + " have walked");
    }

}
