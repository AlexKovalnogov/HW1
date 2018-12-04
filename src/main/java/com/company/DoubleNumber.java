package com.company;

public class DoubleNumber {

    public void functionDoubleNumber() {
try {
    int Number =  ConsoleInputRead.inputAndReadDataFromConsole();
    if (Number % 7 == 0) {
        System.out.println(String.valueOf(Math.abs(Number)) + String.valueOf(Math.abs(Number)));
    }
    else {
        System.out.println("Finish");
    }
}

catch (Exception e)
{
    System.out.println("Wrong input"+e);

}
    }


    public String functionDoubleNumber(int Number) {

            String result="";
            if (Number % 7 == 0) {
               result= String.valueOf(Math.abs(Number)) + String.valueOf(Math.abs(Number));
            }

        return result;

    }


    public static void main(String[] args) {

        DoubleNumber doubleNumber = new DoubleNumber();
        doubleNumber.functionDoubleNumber();

    }




}
