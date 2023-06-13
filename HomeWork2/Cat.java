package HomeWork2;

public class Cat {

    protected final String name;
    protected final int appetite;
    protected boolean wellFed;

    public Cat(String name, int appetited) {
        this.name = name;
        this.appetite = appetited;
        this.wellFed = false;
    }

    public void eat() {}

    public void catEat() {
        System.out.printf("У кота %s аппетит %d еды.\n ", name, appetite);
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isWellFed() {
        return wellFed;
    }

    public void setWellFed(boolean wellFed) {
        this.wellFed = wellFed;
    }
}
