public class Main {
    String name;
    static String dept = "computer science";

    Main(String name) {
        this.name = name;
    }

    void printname() {
        System.out.println("name="+ name+ "  "+"departmrnt="+ dept);
    }
    
    public static void main(String[] args) {

        Main main = new Main("vaibhav");
        main.printname();
    }
}
