package HomeWork3;

import java.util.Random;

public class Freelancer extends Employer {
    double hour;
    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    Random random = new Random();
    @Override
    public double calculateSalary() {
        return (salary / 240) * random.nextInt(10, 240);
    }

    @Override
    public String toString() {
        return String.format("Фрилансер: %s %s; з/п за отработанные часы: %.2f руб.", surname, name, salary);
    }


}
