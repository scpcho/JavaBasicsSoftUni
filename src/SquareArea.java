import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        // Приемаме вход -> страна на квадрат
        // изход -> лицето на квадрата

        // Нов скенер
        // а -> Вход от конзолата (scanner)
        // spaceOfSquare = a * a

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int spaceOfSquare = a * a;
        System.out.println(spaceOfSquare);

    }
}
