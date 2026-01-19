package Practice_2;

public class Main {
    // ===== TASK ONE =====
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("sfsfsfcs", 100);
        System.out.println("Balance is: "+ba.getBalance());
        ba.deposit(110);
        System.out.println("Balance is: "+ba.getBalance());
    }
}
