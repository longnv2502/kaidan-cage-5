import models.Bird;
import models.Cage;
import models.Cat;

public class Main {

    public static void main(String args[]) {
        Cat[] cats = new Cat[5];
        Bird[] birds = new Bird[5];
        Cage cage = new Cage(cats, birds);
        cage.putFirst(new Cat("Tama 1", 1));
        cage.putLast(new Cat("Tama 2", 2));
        cage.putFirst(new Cat("Tama 3", 3));
        cage.putLast(new Cat("Tama 4", 4));
        cage.putFirst(new Cat("Tama 5", 5));

        cage.putLast(new Bird("Pee-chan 1", 1));
        cage.putFirst(new Bird("Pee-chan 2", 2));
        cage.putLast(new Bird("Pee-chan 3", 3));
        cage.putFirst(new Bird("Pee-chan 4", 4));
        cage.putLast(new Bird("Pee-chan 5", 5));

        cage.getAllAnimalsName();

        cage.getFirstCat();
        cage.getLastCat();

        cage.getFirstBird();
        cage.getLastBird();

        cage.getCat("Tama 1");
        cage.getBird("Pee-chan 3");

    }
}