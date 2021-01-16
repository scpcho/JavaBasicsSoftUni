import java.util.Scanner;

public class CharityCampaing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int pastryCooks = Integer.parseInt(scanner.nextLine());
        int cakesPerDay = Integer.parseInt(scanner.nextLine());
        int wafflesPerDay = Integer.parseInt(scanner.nextLine());
        int pancakesPerDay = Integer.parseInt(scanner.nextLine());

        double totalCakesNumber = day * pastryCooks * cakesPerDay;
        double totalWaffleNumber = day * pastryCooks * wafflesPerDay;
        double totalPancakesNumber = day * pastryCooks * pancakesPerDay;

        double totalCakesPrice = totalCakesNumber * 45;
        double totalWafflePrice = totalWaffleNumber * 5.80;
        double totalPancakesPrice = totalPancakesNumber * 3.20;

        double amountCollected = (totalCakesPrice + totalWafflePrice + totalPancakesPrice) * 7/8;
        System.out.printf("%.2f", amountCollected);

    }
}
