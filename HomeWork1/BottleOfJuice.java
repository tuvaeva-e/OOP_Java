package HomeWork1;

public class BottleOfJuice extends Product {
    private double volume;
    private String taste;

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public BottleOfJuice(String brand, String name, double price, double volume, String taste) {
        super(brand, name, price);
        this.taste = taste;
        this.volume = volume;
    }

    public String displayInfo() {
        return String.format("[Бутылка] %s - %s - %f [объем: %f; вкус: %s]", brand, name, price, volume, taste);
    }
}
