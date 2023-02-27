package com.bridgelabz;

import java.util.Scanner;

public class twoStrings {
    public static void main(String[] args) {
        String name1;
        String name2;
        System.out.println("Enter the first string  :");
        Scanner p = new Scanner(System.in);
        name1 = p.nextLine();
        System.out.println("Enter the Second string :");
        name2 = p.nextLine();
        if (name1.equals(name2)) {
            System.out.println("Two strings are  equal");
        }else {
            System.out.println("Two strings are not equal");
        }

    }
}