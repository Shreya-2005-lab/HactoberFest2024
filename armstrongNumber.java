import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-digit number:");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num;
        int sum = 0;
        int n = 0; // number of digits

        // count the number of digits
        while (num != 0) {
            num /= 10;
            n++;
        }

        num = originalNum;
        while (num != 0) {
            int remainder = num % 10;
            sum += Math.pow(remainder, n);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
