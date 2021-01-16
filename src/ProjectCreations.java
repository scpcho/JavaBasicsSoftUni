import java.util.Scanner;

public class ProjectCreations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Architect = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = numberOfProjects * 3;

        System.out.printf("The architect %s will need %s hours to complete %s project/s.", Architect, hoursNeeded, numberOfProjects);
    }
}
