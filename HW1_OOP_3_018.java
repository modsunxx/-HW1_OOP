import java.util.Scanner;
public class HW1_OOP_3_018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if (n%2 != 0) {
            System.err.print(+n+" is prime number");
        }
        else{
            System.err.print(+n+" isn't prime number");
        }
    }
}
