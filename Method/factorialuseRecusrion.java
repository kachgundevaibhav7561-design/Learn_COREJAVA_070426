public class factorialuseRecusrion {
    public static void main(String[] args) {
        public  static int factorialn(int n){
            if (n==0) {
                return 1;
                int result=n*factorial(n-1);
                return result;
                
            }
            
            System.out.println(factorialuseRecusrion.factorialn(5));
        
        }
        factorialuseRecusrion obj=new factorialuseRecusrion();


        
    }
}

