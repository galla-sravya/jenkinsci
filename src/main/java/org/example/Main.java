package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input String: ");
        String s=sc.nextLine();
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println("Reversed String:"+rev);

        sc.close();
    }
}
