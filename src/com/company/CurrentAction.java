package com.company;

import java.util.InputMismatchException;


public class CurrentAction {


    private void CheckAction() {
    int time=0;

    System.out.print("Please input Hours 0-24: ");

try {
  time =  ConsoleInputRead.ReadInputFromConsole();
    if (time<0 || time>24){
        System.out.println("Wrong number");
        new CurrentAction().CheckAction();
    }
    else  if (time >=9 && time<=18){
        System.out.println("I'm working");
    }
    else  if (time<8 || time >18){
        System.out.println("I'm relaxing");
    }
}
catch (InputMismatchException e)
{

    System.out.println("Wrong number "+e);
}
    }

    public  String CheckAction( int time) {

String action="";

            if (time<0 || time>24){
                action = "Wrong number";
            }
            else  if (time >=9 && time<=18){
                action ="I'm working";
            }
            else  if (time<8 || time >18){
                action ="I'm relaxing";
            }
        return action;
        }

    public static void main(String[] args) {

        CurrentAction currentAction = new CurrentAction();
        currentAction.CheckAction();

    }




    }





