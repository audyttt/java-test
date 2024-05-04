import java.util.Scanner;

public class Hw3Lab {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();

        }
        int day = 4;
        switch (day) {
            case 1:

                break;
            case 2:
                break;
            default:
                break;
        }
    }
}
