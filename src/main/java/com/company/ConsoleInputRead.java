package com.company;


import java.util.Scanner;

public class ConsoleInputRead {
    public static int inputAndReadDataFromConsole() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" input data:  ");
        return scanner.nextInt();
    }


}
