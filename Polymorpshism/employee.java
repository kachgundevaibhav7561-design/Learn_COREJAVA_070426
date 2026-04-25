class employees {
    String name;
    double baseSalary;

    public double calculateSalary() {
        return baseSalary;
    }

    public void showDetails() {
        System.out.println("employee" + name + "salry" + calculateSalary());
    }

}

class fullTimeEmployee extends employees {
    double bonus;

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;

    }

    @Override
    public void showDetails() {
        System.out.println("FullTime Employees" + name + "salary" + calculateSalary());
    }

}

class partTimeEmployee extends employees {
    int hoursWorked;
    double hoursRate;

    @Override
    public double calculateSalary() {
        return hoursWorked * hoursRate;
    }

    @Override
    public void showDetails() {
        System.out.println("part time employee" + name + "salary" + calculateSalary());

    }
}

class TemporaryEmployee extends employees {
    int dayeworked;
    double dailyRate;

    @Override
    public double calculateSalary() {
        return dayeworked * dailyRate;
    }

    @Override
    public void showDetails() {
        System.out.println("Temporary employee" + name + "salary" + calculateSalary());
    }
}

public class employee {
    public static void main(String[] args) {

    }
}
