import java.util.Scanner;
import java.util.Arrays;

public class HW1_OOP_4_018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int num[] = { 3, 2, 1, 10, 2, 8, 3, 2, 1, 1, 8, 5, 10, 11, 7, 6, 10 };
        int second = -1;
        int count = 0;
        
        for (int i = num.length - 1; i >= 0; i--) {
             if (num[i] == n) {
                 count++; 
             if (count == 2) {
                 second = i; 
                 break; 
                }
            }
        }
        if (second != -1) {
             System.out.println("secondindex: " + second); 
            } 
            else {
                 System.out.println("-1"); 
                }
    }
}
