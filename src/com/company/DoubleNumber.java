package com.company;

import com.intellij.openapi.vcs.history.VcsRevisionNumber;

public class DoubleNumber {

    public void FunctionDoubleNumber() {
try {
    int Number =  ConsoleInputRead.ReadInputFromConsole();
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


    public String FunctionDoubleNumber(int Number) {

            String result="";
            if (Number % 7 == 0) {
               result= String.valueOf(Math.abs(Number)) + String.valueOf(Math.abs(Number));
            }

        return result;

    }







}
