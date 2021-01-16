import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawBerriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawBerriesKg = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = (strawBerriesPrice * 0.50);
        double orangePrice = (raspberriesPrice * 0.60);
        double bananasPrice = (raspberriesPrice * 0.20);

        double bill = ((strawBerriesKg * strawBerriesPrice) + (bananasKg * bananasPrice) + (orangeKg * orangePrice) + (raspberriesKg * raspberriesPrice));

        System.out.printf("%.2f",bill);
    }
}
