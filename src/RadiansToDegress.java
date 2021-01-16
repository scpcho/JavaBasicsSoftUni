import java.util.Scanner;

public class RadiansToDegress {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        double radians = Double.parseDouble(newScanner.nextLine());
        double degress = radians * 180 / Math.PI;
        System.out.printf("%.0f", degress);
    }
}

