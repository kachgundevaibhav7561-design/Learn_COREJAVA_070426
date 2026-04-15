public class Main {
    public static void main(String[] args) {
        employee obj = new employee();
        employee obj1 = new employee();

        obj1.emp_id = 2;
        obj1.name = "Yogesh";
        obj1.Salary = 35000.45f;

        // System.out.println(obj1.emp_id);
        // System.out.println(obj1.name);
        // System.out.println(obj1.Salary);

        obj.emp_id = 1;
        obj.name = "vaibhav";
        obj.Salary = 40000.89f;

        // System.out.println("emp_id=" + obj.emp_id);
        // System.out.println("Name=" + obj.name);
        // System.out.println("Salary=" + obj.Salary);

        obj.showDetails();
        obj1.showDetails();

    }
}

class employee {
    int emp_id;
    String name;
    float Salary;


    public void showDetails(){
        System.out.println(emp_id);
        System.out.println(name);
        System.out.println(Salary);

    }

}
