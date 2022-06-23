/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. What's your name?");
        String userName = scanner.nextLine();
        while (true) {
            if (userName.equalsIgnoreCase("Alice")) {
                System.out.println("Hello " + userName + ".");
                break;

            } else if (userName.equalsIgnoreCase("Bob")) {
                System.out.println("Hello " + userName + ".");
                break;
            } else {
                System.out.println("");
            }
        }

    }
}
