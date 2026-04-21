//base class
class account {
    String accountHolderName;
    double balance;

    void dislplay(double amount) {
        balance += amount;
        System.out.println("Balance is =" + balance);

    }
}

//derived class
class savingAccount extends account {
    double intrestRate;

    void applyIntrest() {
        double intrest = balance * intrestRate / 100;

        balance += intrest;
        System.out.println(balance);

    }
}

class premiunSavingAccount extends savingAccount {
    double bonus;

    public void applyBonus() {
        balance += (balance * bonus) / 100;
        System.out.println(" bonus is= " + bonus);
    }

}

class currentAccount extends account {
    double overdratlimit;
    
     void withdraw(double amount){
        if (overdratlimit+balance>=amount) {
            balance-= amount;
            System.out.println("withdraw="+amount+"new balance="+balance);
 
        }else{
            System.out.println("withdrawl denied : overdraft limit excced");
        }
        System.out.println("This is current account");
    }
  
    
}



public class Hierachical {
    public static void main(String[] args) {
        savingAccount sa=new savingAccount();
        sa.accountHolderName="vaibhav";
        sa.balance=1000;
        sa.intrestRate=6;
        sa.dislplay(500);
        sa.applyIntrest();

        currentAccount ca=new currentAccount();
        ca.accountHolderName="rahul";
        ca.balance=2000;
        ca.overdratlimit=500;
        ca.withdraw(3500);
    }
}
