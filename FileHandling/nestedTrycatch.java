package FileHandling;

public class nestedTrycatch {
    public static void main(String[] args) {
        try{
            int arr[]={10,20,30};

            System.out.println(arr[2]);
        try{
            int a=10;
            int b=0;

            int res=a/b;

            System.out.println(res);

        } catch(ArithmeticException e){
            System.out.println("Inner catch: Cannot divide by zero");
        }


        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("outer catch:Array index problem");
        }
        System.out.println("Program continous..........");
}
}
