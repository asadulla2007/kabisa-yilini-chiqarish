package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(in);

        System.out.println("Year: ");
        int year = scanner.nextInt();

        if (year % 4 ==0) {
            System.out.println("kabisa yili");
        }else {
            System.out.println("kabisa yili emas");
        }
















    }
}
