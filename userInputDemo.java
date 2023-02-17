import java.util.Scanner;

public class userInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sureName = sc.nextLine();

        System.out.println(name);
        System.out.println(sureName);

        System.out.printf("hello how ar you %s",name);

    }
}
