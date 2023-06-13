package HomeWork2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 10);
        Cat cat2 = new Cat("Васька", 3);
        Cat cat3 = new Cat("Рыжик", 6);
        Cat cat4 = new Cat("Яшка", 5);
        Cat cat5 = new Cat("Бегемот", 12);
        Plate plate = new Plate(7);

        if (plate.getFood() >= cat1.getAppetite() && !cat1.isWellFed()) {
            int remainder = plate.getFood() - cat1.getAppetite();
            System.out.printf("В тарелке еды %d, кот %s поел %d еды, в тарелке осталось %d еды, кот сыт.\n", plate.getFood(), cat1.getName(), cat1.getAppetite(), remainder);
            plate.setFood(remainder);
            cat1.setWellFed(true);
        } else if (!cat1.isWellFed()){
            System.out.printf("В тарелке еды %d, кот %s хочет %d еды, кот обиделся и есть не стал.\n", plate.getFood(), cat1.getName(),  cat1.getAppetite());
        } else {
            System.out.printf("Кот %s больше не хочет %d еды, кот поел и спит.\n", cat1.getName(),  cat1.getAppetite());
        }
        System.out.println("---------------------");

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        feedTheCats (cats, plate);
        System.out.println("---------------------");
        areTheCatsHungry (cats);
        System.out.println("---------------------");
        plate.addFood(20);
        System.out.println("---------------------");
        feedTheCats (cats, plate);
        System.out.println("---------------------");
        areTheCatsHungry (cats);
        System.out.println("---------------------");
    }

    public static void feedTheCats (ArrayList<Cat> cats, Plate plate) {
        for (Cat cat: cats) {
            if (!cat.isWellFed() && plate.getFood() > 0) {
                if (plate.getFood() >= cat.getAppetite()) {
                    int remainder = plate.getFood() - cat.getAppetite();
                    System.out.printf("В тарелке еды %d, кот %s поел %d еды, в тарелке осталось %d еды, кот сыт.\n", plate.getFood(), cat.getName(), cat.getAppetite(), remainder);
                    plate.setFood(remainder);
                    cat.setWellFed(true);
                } else {
                    System.out.printf("В тарелке еды %d, кот %s хочет %d еды, кот обиделся и есть не стал.\n", plate.getFood(), cat.getName(),  cat.getAppetite());
                }
            } else System.out.printf("Кот %s сыт.\n", cat.getName());
        }

        if (plate.getFood() > 0) System.out.println("Еды в тарелке недостаточно");
        else System.out.println("Еда кончилась");
    }

    public static void areTheCatsHungry (ArrayList<Cat> cats) {
        for (Cat cat: cats) {
            if (cat.isWellFed()) System.out.printf("Кот %s поел, кот сыт.\n", cat.getName());
            else System.out.printf("Кот %s голоден.\n", cat.getName());
        }
    }
}