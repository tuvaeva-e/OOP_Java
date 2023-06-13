package HomeWork2;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.printf("В тарелке %d еды.\n", food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food < 0) this.food = 0;
        else this.food = food;
    }

    public void addFood (int addFood) {
        int food = getFood();
        if (addFood < 0) System.out.println("В тарелку можно только положить еду");
        else this.food = food + addFood;
        System.out.printf("В тарелке стало %d еды.\n", this.food);
    }
}
