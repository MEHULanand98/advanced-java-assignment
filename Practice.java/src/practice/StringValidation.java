package practice;

import java.util.Scanner;
public class StringValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String regex = "^(?=.*\\d)[A-Z][A-Za-z0-9]{4,10}[a-z]$";

        if (s.matches(regex)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}