package com.company;



public class CheckTypeOfTriangle {


    public void CheckTriangle()  {


            int SideA = ConsoleInputRead.ReadInputFromConsole();
            int SideB = ConsoleInputRead.ReadInputFromConsole();
            int SideC = ConsoleInputRead.ReadInputFromConsole();

            if(SideA<0||SideB<0||SideC<0) {
                System.out.println("Length of Side can't be with minus"); }

            else if(SideA>=SideB+SideC||SideC>=SideA+SideB||SideB>=SideA+SideC){

                System.out.println("Triangle doesn't exsist");
            }
            else  if (Math.pow(SideA,2)==Math.pow(SideB,2)+Math.pow(SideC,2)||Math.pow(SideB,2)==Math.pow(SideC,2)+Math.pow(SideA,2)||Math.pow(SideC,2)==Math.pow(SideB,2)+Math.pow(SideA,2))
            {
                System.out.println("Triangle is right angled");
            }
            else {System.out.println("Triangle is not right angled");}
        }

    public String CheckTriangle( double SideA,double SideB, double SideC)  {
             String TypeOfTriangle="";

        if(SideA<0||SideB<0||SideC<0) {
            TypeOfTriangle="Length of Side can't be with minus"; }

        else if(SideA>=SideB+SideC||SideC>=SideA+SideB||SideB>=SideA+SideC){
            TypeOfTriangle="Triangle doesn't exsist";
        }
        else  if (Math.pow(SideA,2)==Math.pow(SideB,2)+Math.pow(SideC,2)||Math.pow(SideB,2)==Math.pow(SideC,2)+Math.pow(SideA,2)||Math.pow(SideC,2)==Math.pow(SideB,2)+Math.pow(SideA,2))
        {
            TypeOfTriangle="Triangle is right angled";
        }
        else {
            TypeOfTriangle="Triangle is not right angled";}
            return TypeOfTriangle;
    }
    ///////////////////////
    public static void main(String[] args) {


        CheckTypeOfTriangle checkTypeOfTriangle = new CheckTypeOfTriangle();
        try{  checkTypeOfTriangle.CheckTriangle();}
        catch (Exception e)
        { }


    }



////////////////////////




}
