import java.util.Scanner;

public class HW1_OOP_1_018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thousandBaht = 0, fiveHundredBaht = 0, hundredBaht = 0, fiftyBaht = 0, twentyBaht = 0;
        int tenBaht = 0, fiveBaht = 0, twoBaht = 0, oneBaht = 0;

        System.out.print("Enter the amount of money: ");
        int amount = scanner.nextInt();

        if (amount >= 1000) {
            thousandBaht = amount / 1000;
            amount %= 1000;
        }
        if (amount >= 500) {
            fiveHundredBaht = amount / 500;
            amount %= 500;
        }
        if (amount >= 100) {
            hundredBaht = amount / 100;
            amount %= 100;
        }
        if (amount >= 50) {
            fiftyBaht = amount / 50;
            amount %= 50;
        }
        if (amount >= 20) {
            twentyBaht = amount / 20;
            amount %= 20;
        }
        if (amount >= 10) {
            tenBaht = amount / 10;
            amount %= 10;
        }
        if (amount >= 5) {
            fiveBaht = amount / 5;
            amount %= 5;
        }
        if (amount >= 2) {
            twoBaht = amount / 2;
            amount %= 2;
        }
        if (amount >= 1) {
            oneBaht = amount;
        }

        System.out.println("1000 Baht bills: " + thousandBaht);
        System.out.println("500 Baht bills: " + fiveHundredBaht);
        System.out.println("100 Baht bills: " + hundredBaht);
        System.out.println("50 Baht bills: " + fiftyBaht);
        System.out.println("20 Baht coins: " + twentyBaht);
        System.out.println("10 Baht coins: " + tenBaht);
        System.out.println("5 Baht coins: " + fiveBaht);
        System.out.println("2 Baht coins: " + twoBaht);
        System.out.println("1 Baht coins: " + oneBaht);

        scanner.close();
    }
}
