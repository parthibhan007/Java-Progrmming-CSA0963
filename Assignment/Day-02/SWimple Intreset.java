import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate,time,simpleInterest,principal;
        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter rate of interest (in percentage): ");
        rate = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        time = scanner.nextDouble();
        simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: $" + simpleInterest);
    }
}
