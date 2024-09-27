package Day_13;

interface Bank {

    String getBankName();
    double checkBalance();

    void deposit(double amount);
    void withdraw(double amount);
}

class CitiBank implements Bank {

    String bankName = "Citi Bank";
    String accountHolderName="Krishna Bhosle";
    long accountNumber=94857392;
    double balance = 120000;

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance+= amount;
        System.out.println("deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("withdrown "+ amount);
    }
}

class HDFC implements Bank{

    @Override
    public String getBankName() {
        return null;
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
public class BankDemo {

    public static void main(String[] args) {

        Bank citi = new CitiBank();
        System.out.println(citi.getBankName() + " balance is :" + citi.checkBalance());
        citi.deposit(10034334.0);
        citi.withdraw(5454);

    }
}
