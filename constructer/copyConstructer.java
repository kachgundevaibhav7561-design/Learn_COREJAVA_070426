
public class copyConstructer {
    class employee {
        String name;
        double salary;

        employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
            System.out.println("constrcuter exacuted");

        
       void dispalyDetails() {
            System.out.println("Employee name=" + name + "     " + "salary is= " + salary);
        }
    }

    public static void main(String[] args) {
        employee emp = new employee("vaibhav", 50000);
        emp.dispalyDetails();

        

    }

}
}
