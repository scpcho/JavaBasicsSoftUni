import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double priceForLandscaping = squareMeters * 7.61;
        double priceForLandscapingDiscount = (0.18 * priceForLandscaping);
        double totalPrice = (priceForLandscaping - priceForLandscapingDiscount);

        System.out.printf("The Final price is: %.2f lv.%n", totalPrice);
        System.out.printf("The discount is: %.2f lv.%n", priceForLandscapingDiscount);
    }
}