package HomeWork3;

import java.util.Random;

public class Manager extends Employer {

    public Manager(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    Random random = new Random();

    @Override
    public double calculateSalary() {

        return salary + (salary * 0.15 * random.nextInt(40000, 80000));
    }
    @Override
    public String toString() {
        return String.format("Менеджер: %s %s; з/п + проценты от продаж: %.2f руб.", surname, name, salary);
    }

}
