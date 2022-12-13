import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count, i, number;
        int min = 0, max = 0;

        System.out.print("How many numbers do you need to check? : ");
        count = scanner.nextInt();

        for (i = 1; i <= count; i++) {
            System.out.print("Number " + i + " : ");
            number = scanner.nextInt();
            if (number >= max) {
                max = number;
            } else if (number <= min) {
                min = number;
            }
        }
        System.out.println("The min value: " + min);
        System.out.print("The max value: " + max);
    }
}

