package models;

import java.util.Arrays;

public class Cage {
    private final Cat[] catArray;
    private int catSize;
    private final Bird[] birdArray;
    private int birdSize;

    public Cage(Cat[] catArray, Bird[] birdArray) {
        this.catArray = catArray;
        this.birdArray = birdArray;
        catSize = 0;
        birdSize = 0;
    }

    public void putFirst(Cat cat) {
        if (catSize == catArray.length) {
            System.out.println("Cat is full");
        }
        for (int i = catSize - 1; i >= 0; i--) {
            catArray[i + 1] = catArray[i];
        }
        catArray[0] = cat;
        catSize++;
        System.out.println(cat.name + " has put first");
    }

    public void putFirst(Bird bird) {
        if (birdSize == birdArray.length) {
            System.out.println("Bird is full");
        }
        for (int i = birdSize - 1; i >= 0; i--) {
            birdArray[i + 1] = birdArray[i];
        }
        birdArray[0] = bird;
        birdSize++;
        System.out.println(bird.name + " has put first");
    }

    public void putLast(Cat cat) {
        if (catSize == catArray.length) {
            System.out.println("Cat is full");
        }
        catArray[catSize++] = cat;
        System.out.println(cat.name + " has put last");
    }

    public void putLast(Bird bird) {
        if (birdSize == birdArray.length) {
            System.out.println("Bird is full");
        }
        birdArray[birdSize++] = bird;
        System.out.println(bird.name + " has put last");
    }

    public String[] getAllAnimalsName() {
        String[] animalsName = new String[catArray.length + birdArray.length];
        for (int i = 0; i < catArray.length; i++) {
            animalsName[i] = catArray[i].getName();
        }
        for (int i = catArray.length; i < catArray.length + birdArray.length; i++) {
            animalsName[i] = birdArray[i - catArray.length].getName();
        }
        System.out.println(String.join(", ", animalsName));
        return animalsName;
    }

    public Cat getFirstCat() {
        Cat first = catArray[0];
        System.out.println(first.name + " is first cat");
        return first;
    }

    public Cat getLastCat() {
        Cat last = catArray[catSize - 1];
        System.out.println(last.name + " is last cat");
        return last;
    }

    public Bird getFirstBird() {
        Bird first = birdArray[0];
        System.out.println(first.name + " is first bird");
        return first;
    }

    public Bird getLastBird() {
        Bird last = birdArray[birdSize - 1];
        System.out.println(last.name + " is last bird");
        return last;
    }

    public Cat getCat(String name) {
        Cat find = null;
        for (Cat cat : catArray) {
            if (cat.getName().equals(name)) {
                find = cat;
            }
        }
        if (find != null) {
            find.mew();
            find.walk();
            find.grow();
            System.out.println("Cat " + find.name + " is found");
            return find;
        }
        System.out.println("Cat " + name + " not found");
        return null;
    }

    public Bird getBird(String name) {
        Bird find = null;
        for (Bird bird : birdArray) {
            if (bird.getName().equals(name)) {
                find = bird;
            }
        }
        if (find != null) {
            find.sing();
            find.fly();
            find.grow();
            System.out.println("Bird " + find.name + " is found");
            return find;
        }
        System.out.println("Bird " + name + " not found");
        return null;
    }

}
