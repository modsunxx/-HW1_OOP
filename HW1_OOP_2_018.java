import java.util.Scanner;
public class HW1_OOP_2_018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}