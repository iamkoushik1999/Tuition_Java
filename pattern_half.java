import java.util.Scanner;

public class pattern_half {
    public static void main(String[] args) {

        System.out.println("enter the number you want to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }

    }

}