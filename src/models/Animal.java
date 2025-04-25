package models;

public class Animal {
    protected String name;
    protected int age;

    void grow() {
        System.out.println(this.name + " now " + this.age + " years old");
        this.age = this.age + 1;
        System.out.println(this.name + " now " + this.age + " years old");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
