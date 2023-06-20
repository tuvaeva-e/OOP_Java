package HomeWork4;

public class Program {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Box boxApple1 = new Box<Apple>(apple);
        System.out.println(boxApple1);

        boxApple1.addFruitInBox(3);
        System.out.println(boxApple1);
        System.out.println("fruit in box: " + boxApple1.getQuantityFruitInBox());
        System.out.println("boxes weight: " + boxApple1.getWeightBox());

        Orange orange = new Orange();
        Box boxOrange1 = new Box<>(orange);
        boxOrange1.addFruitInBox(3);
        System.out.println(boxOrange1);
        boxOrange1.addFruitInBox(-5);
        System.out.println(boxOrange1);
        System.out.println("fruit in box: " + boxOrange1.getQuantityFruitInBox());
        System.out.println("boxes weight: " + boxOrange1.getWeightBox());

        System.out.println("Is Box width apple and box width orange equal? - " + boxOrange1.compare(boxApple1));

        Box boxOrange2 = new Box<>(orange);
        boxOrange2.addFruitInBox(3);
        System.out.println(boxOrange2);
        System.out.println("fruit in box: " + boxOrange2.getQuantityFruitInBox());
        System.out.println("boxes weight: " + boxOrange2.getWeightBox());

        shiftFruits (boxOrange1, boxOrange2, 2);
        System.out.println("fruit in box: " + boxOrange1.getQuantityFruitInBox());
        System.out.println("boxes weight: " + boxOrange1.getWeightBox());
        System.out.println("fruit in box: " + boxOrange2.getQuantityFruitInBox());
        System.out.println("boxes weight: " + boxOrange2.getWeightBox());

        shiftFruits (boxOrange1, boxApple1, 1);
    }

    public static void shiftFruits (Box<Fruit> fruitBoxOut, Box<Fruit> fruitBoxIn, int count) {
        if (
             ((fruitBoxOut.getFruit() instanceof Apple && fruitBoxIn.getFruit() instanceof Apple) ||
             (fruitBoxOut.getFruit() instanceof Orange && fruitBoxIn.getFruit() instanceof Orange)) &&
              fruitBoxOut.getQuantityFruitInBox() >= count
        ) {
            fruitBoxOut.removeFruitInBox(count);
            fruitBoxIn.addFruitInBox(count);
        } else System.out.println("operation is not possible");
    }
}
