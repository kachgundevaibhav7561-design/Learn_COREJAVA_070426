
public class ifExample {
    public static void main(String[] args) {
        int age = 14;
        if (age >= 18) {
            System.out.println("Adult");

        } else {
            System.out.println("child");
        }

        // else_if
        /*
         * ===============
         * if(condition)
         * {
         * block of ocde;
         * 
         * }else_if(condition)
         * {
         * 
         * }else_if(condition)
         * {
         * 
         * }n_of condition......
         * 
         * 
         * 
         *
         * 
         * 
         * 
         * 
         * 
         * 
         * nested_if
         * 
         * int agee = 22;
         * boolean haslisence = true;
         * 
         * if (agee >= 18) {
         * System.out.println("you cna drive");
         * } else {
         * System.out.println("you need lisenccee");
         * 
         * 
         * }
         * 
         * 
         * //ternary operator;
         * int mark=67;
         * String result= (mark>=90)?"Grade A":
         * (mark>=70)?"grade B":
         * (mark>=50)?"grade c":"fail";
         * 
         * =use ternry using leap year or not:
         * 
         * 
         * 
         * 
         * System.out.println(result);
         * int year=2004;
         * 
         * if (year %4==0){
         * System.out.println("Year is lear year");
         * }else{
         * System.out.println("Is not leap");
         * }
         */

        int year = 1788;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap ? "leap year" : "Not leap year");

    }

}
