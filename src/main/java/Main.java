import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("JHU - WSE - CS Dpt.");
        System.out.println("Spring 2021");
        System.out.println("Class Search");
        System.out.println("Enter your search query");

        String query = scan.nextLine();
        search(query);
    }

    private static void search(String q) {
        System.out.println("Search not implemented yet!");
    }

}
