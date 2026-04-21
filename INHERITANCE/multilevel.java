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

class premiunSavingAccount extends savingAccount {
    double bonus;

    public void applyBonus() {
        balance += (balance * bonus) / 100;
        System.out.println(" bonus is= " + bonus);
    }

}

public class multilevel {
    public static void main(String[] args) {
        // savingAccount obj = new savingAccount();
        premiunSavingAccount obj = new premiunSavingAccount();

        obj.accountHolderName = "yogesh";
        obj.balance = 1000;
        obj.intrestRate = 5.0;
        obj.dislplay(500);
        obj.applyIntrest();
        obj.bonus = 2;
        obj.applyBonus();

    }

}
