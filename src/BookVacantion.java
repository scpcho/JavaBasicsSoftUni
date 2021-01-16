import java.util.Scanner;
//1. прочетем входните данни и да ги съхраним в променливи
//2. за колко часа трябва да прочете книгата = бр.стр / стр. за час
//3. колко часа на ден  = за колко часа трябва да прочете книгата / дни
//4. печатаме получените часове

public class BookVacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagePerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int hoursToRead = bookPages / pagePerHour;
        int hoursPerDay = hoursToRead / daysToRead;
        System.out.println(hoursPerDay);


    }
}
