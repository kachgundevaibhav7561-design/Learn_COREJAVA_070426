class InsufficientBalanceexception extends Exception{
    public InsufficientBalanceexception(String message){
        super(message);
    }
}

class bankAccount{
    int balance=5000;

    void withdraw(int amount) throws InsufficientBalanceexception{
        if (amount>balance) {
            throw new InsufficientBalanceexception("Insufficient balance");  
            
        }
        balance-=amount;

        System.out.println("withdrawal succesful:");
        System.out.println("remaining balacne:"+ balance);
    }
}
public class customEception {
    public static void main(String[] args) {
        bankAccount account=new bankAccount();
        
        try{
            account.withdraw(40000);
        }catch(InsufficientBalanceexception e){
            System.out.println("error"+e.getMessage());
        }
    }
    
}
