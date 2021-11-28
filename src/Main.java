public class Main {
    public static void main(String[] args) {
        int bankAccount = 200;

        int accountRefill = 1190;
        int bonus;
        int threshold = 1000;
        int bankAccountRefilled = bankAccount + accountRefill;
        if (accountRefill > threshold) {
            bonus = accountRefill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш бонус = " + bonus);
        System.out.println("Ваш баланс = " + bankAccountRefilled);
    }
}
