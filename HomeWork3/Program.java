package HomeWork3;

import java.util.Arrays;
import java.util.Random;

public class Program {
    static Random random = new Random();

    public static Employer[] generateEmployer() {
        Employer[] employers = new Employer[10];
        String[] names = new String[] {"Юрий", "Егор", "Алексей", "Камиль", "Владимир", "Данил", "Леонид", "Артём", "Елизар", "Олег"};
        String[] surnames = new String[] {"Тимофеев", "Никольский", "Мухин", "Золотарев", "Котов", "Романов", "Петров", "Павлов", "Дмитриев", "Демидова"};

            for (int i = 0; i < employers.length; i++) {
                int classNumber = random.nextInt(1, 3);
                int salary = random.nextInt(20000, 80000);
                if (classNumber == 0) employers[i] = new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary);
                if (classNumber == 1) employers[i] = new Manager(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary);
                if (classNumber == 2) employers[i] = new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary);
            }
            return employers;
    }

    public static void main(String[] args) {
        Employer[] employers = generateEmployer();


                Arrays.sort(employers);

        for (Employer employer: employers) {
            System.out.println(employer);
        }
    }
}
