public class encapsulation {
    public static void main(String[] args) {
        StateBankOfIndia a1 = new StateBankOfIndia();
        System.out.println("availabe balance: " + a1.getBalance());
        a1.addBalance(1000);
        System.out.println("availabe balance: " + a1.getBalance());
        a1.withdrawBalance(500);
        System.out.println("availabe balance: " + a1.getBalance());

    }
}

class StateBankOfIndia {
    private double balance = 0;

    public void addBalance(int amt) {
        if (amt > 0) {
            this.balance = amt;
            System.out.println("amount added");
        } else {
            System.out.println("amount is not valid");
        }
    }

    public void withdrawBalance(int amt) {
        if (amt < 0 && this.balance < amt) {
            System.out.println("invalid amount or insufficient balance.");
        } else {
            System.out.println("amount withdraw: " + amt);
            this.balance -= amt;
            System.out.println("updated balance: " + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }
}