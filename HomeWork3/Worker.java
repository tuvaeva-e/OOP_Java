package HomeWork3;

public class Worker extends Employer{

    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Рабочий: %s %s; Фиксированная з/п: %.2f руб.", surname, name, salary);
    }
}
