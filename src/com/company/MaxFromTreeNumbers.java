package com.company;

import java.util.Arrays;


public class MaxFromTreeNumbers {


    public void MaxNumber(){

  int value1=ConsoleInputRead.ReadInputFromConsole();
  int value2=ConsoleInputRead.ReadInputFromConsole();
  int value3=ConsoleInputRead.ReadInputFromConsole();

        int[] bufArr = new int[3];
        bufArr[0]=value1;
        bufArr[1]=value2;
        bufArr[2]=value3;
        Arrays.sort(bufArr);

System.out.println("Maxvalue = "+bufArr[2]);
            }

    public int MaxNumber(int var1 ,int var2 , int var3){

        int[] bufArr = new int[3];
        bufArr[0]=var1;
        bufArr[1]=var2;
        bufArr[2]=var3;
        Arrays.sort(bufArr);

        return bufArr[2];
    }




///////////////////////
public static void main(String[] args) {


  //  MaxFromTreeNumbers maxFromTreeNumbers = new MaxFromTreeNumbers();
  //  maxFromTreeNumbers.MaxNumber();
   // maxFromTreeNumbers.MaxNumber(ConsoleInputRead.ReadInputFromConsole(),ConsoleInputRead.ReadInputFromConsole(),ConsoleInputRead.ReadInputFromConsole());
}

////////////////////////


}





