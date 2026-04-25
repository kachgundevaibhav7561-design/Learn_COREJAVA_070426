public class E {

    public static void main(String[] args) {
        Employee emp1 = new FulltimeEmployee();
        emp1.name = "Harsh";
        emp1.baseSalary = 20000;
        ((FulltimeEmployee) emp1).bonous = 3000;

        Employee emp2 = new ParttimeEmployee();
        emp2.name = "Raju";
        ((ParttimeEmployee) emp2).hoursWorked = 8;
        ((ParttimeEmployee) emp2).hourlyRate = 150;

        Employee emp3 = new TemporaryEmployee();
        emp3.name = "Sneha";
        ((TemporaryEmployee) emp3).daysWorked = 6;
        ((TemporaryEmployee) emp3).dailyRate = 200;

        //Runtime Polymorphishm
        emp1.showDetials();
        emp2.showDetials();
        emp3.showDetials();

        // Employee emp;
        // emp = new FulltimeEmployee();
        // emp = new ParttimeEmployee();
        // emp = new TemporaryEmployee();
    }
}

class Employee {

    String name;
    double baseSalary;

    public double calculateSalary() {
        return baseSalary;
    }

    public void showDetials() {
        System.out.println("Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class FulltimeEmployee extends Employee {

    double bonous;

    @Override
    public double calculateSalary() {
        return baseSalary + bonous;
    }

    @Override
    public void showDetials() {
        System.out.println("Fulltime Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class ParttimeEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void showDetials() {
        System.out.println("Part-time Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class TemporaryEmployee extends Employee {

    int daysWorked;
    double dailyRate;

    @Override
    public double calculateSalary() {
        return daysWorked * dailyRate;
    }

    @Override
    public void showDetials() {
        System.out.println("Temporary Employee: " + name + ", Salary: " + calculateSalary());
    }
}