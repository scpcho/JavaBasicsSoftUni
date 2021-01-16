import java.util.Scanner;

//наем на залата -> от конзолата
//цена за тортата -> 20 % от залата = 0.2 * наем на залата
//цена за напитки -> тортата - 45% = тортата - 0.45 * тортата
//цена за аниматора -> 1 / 3 от наем на залата = наем на залата / 3
//разходите = наем на залата + торта + напитки + аниматор

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallPrice = Integer.parseInt(scanner.nextLine());
        double cakePrice = 0.2 * hallPrice;
        double drinks = cakePrice - 0.45 * cakePrice;
        double animatorPrice = hallPrice / 3.0;
        double expenses = hallPrice + cakePrice + drinks + animatorPrice;
        System.out.println(expenses);



    }
}
