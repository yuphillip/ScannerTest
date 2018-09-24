package Pyu;

import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String response = input.nextLine();
        System.out.println("Nice to meet you" + " " + response + "!");
        input.close();
    }
}
