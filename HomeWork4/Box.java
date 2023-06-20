package HomeWork4;

import java.util.ArrayList;

public class Box <F extends  Fruit>{
    private final F fruit;
    private ArrayList<F> fruits;

    public Box(F fruit) {
        this.fruit = fruit;
        this.fruits = new ArrayList<F>();
    }

    public F getFruit() {
        return fruit;
    }

    public ArrayList<F> addFruitInBox (int quantityFruit) {

        for (int i = 0; i < Math.abs(quantityFruit); i++) {
            fruits.add(fruit);
        }
        return fruits;
    }

    public ArrayList<F> removeFruitInBox (int quantityFruit) {
        if (getQuantityFruitInBox() >= quantityFruit) {
            for (int i = 0; i < Math.abs(quantityFruit); i++) {
                fruits.remove(0);
            }
            return fruits;
        } else {
            System.out.println("operation is not possible");
            return fruits;
        }
    }

    public float getQuantityFruitInBox() {
        return fruits.size();
    }

    // высчитывает вес коробки, зная вес одного фрукта
    public double getWeightBox () {
        return fruits.size() * fruit.getWeigth();
    };

    @Override
    public String toString() {
        return "Box for: " + fruit.getName() +
                ", in box: " + fruits;
    }

    public boolean compare(Box o) {
        if (getWeightBox() == o.getWeightBox()) return true;
        return false;
    }
}
