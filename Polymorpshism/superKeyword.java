public class superKeyword {
    public static void main(String[] args) {
        
    }
}

class Employee{
    String company;

    Employee(String company){
        this.company=company;
        System.out.println("Employee Constructer called....");
    }
    void GetDetails(){
        System.out.println("company"+company);
    }

}

class Manager extends employee{
    String Department;


    Manager(String company,String Department){
        super(company);

        this.Department=Department;
        System.out.println("Manager Constructer called...");
    }
}


void GetDetails
