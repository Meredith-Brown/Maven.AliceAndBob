/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        while ((name.equals("Alice")) || (name.equals("Bob"))) {
            System.out.println("Greetings!");
            break;
        }
        }
        }
