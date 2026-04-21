//base class
class account {
    String accountHolderName;
    double balance;

    void dislplay(double amount) {
        balance += amount;
        System.out.println("Balance is =" + balance);

    }
}
// derived class
class savingAccount extends account {
    double intrestRate;

    void applyIntrest() {
        double intrest = balance * intrestRate / 100;

        balance += intrest;
        System.out.println(balance);

    }
}

public class singleInheritance {
    public static void main(String[] args) {
        savingAccount obj = new savingAccount();

        obj.accountHolderName = "yogesh";
        obj.balance = 1000;
        obj.intrestRate = 5.0;
        obj.dislplay(500);
        obj.applyIntrest();
        // obj.accountHolderName="vaibhav";
    }
}
