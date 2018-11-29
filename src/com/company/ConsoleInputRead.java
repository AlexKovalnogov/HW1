package com.company;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputRead// implements iConsoleInputRead
{
/*static String input;
static int result;
static {
    input="";
    result=0;
}*/
    public static int ReadInputFromConsole(){
       String input;
         int result=0;

    Scanner  scanner = new Scanner(System.in);
    System.out.print(" Input data:  ");
        input=  scanner.next();
        try {
            result=Integer.valueOf(input);
        }
        catch (Exception e)
        {
            System.out.println("Can not convert to int: "+e);
        }
        return result;
    }







}
