package HomeWork3;

public abstract class Employer implements Comparable<Employer>{
    protected String name;
    protected String surname;
    protected double salary;// ставка

    public Employer(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
 
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employer o) {
        int res = surname.compareTo(o.surname);
        if (res == 0) {
            return Double.compare(calculateSalary(), o.calculateSalary());
        } else {
            return res;
        }
    }
}
