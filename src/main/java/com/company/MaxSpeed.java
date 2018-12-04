package com.company;

import org.apache.log4j.Logger;




public class MaxSpeed {
 static   Logger logger = Logger.getLogger(MaxSpeed.class);

    private double SpeedKmPerHour = 0;
    private double SpeedMetersPerSecond = 0;
   // static Logger logger = Logger.getLogger(MaxSpeed.class);

    public double getSpeedKmPerHour() {
        return SpeedKmPerHour;
    }

    public void setSpeedKmPerHour(double speedKmPerHour) {
        SpeedKmPerHour = speedKmPerHour;
    }

    public double getSpeedMetersPerSecond() {
        return SpeedMetersPerSecond;
    }

    public void setSpeedMetersPerSecond(double speedMetersPerSecond) {
        SpeedMetersPerSecond = speedMetersPerSecond;
    }

    public void CompareSpeed() {

        int i = 0;
        System.out.print("Speed KM/h ");
        setSpeedKmPerHour(ConsoleInputRead.inputAndReadDataFromConsole());
        System.out.print("Speed M/s ");
        setSpeedMetersPerSecond(ConsoleInputRead.inputAndReadDataFromConsole());
        double SpeedTrasnsform = SpeedKmPerHour * 0.27777777;

        double MaxValue = 0;

        if (SpeedKmPerHour < 0 || SpeedMetersPerSecond < 0) {
            System.out.println("Speed can;t be less 0");

        } else if (SpeedTrasnsform < SpeedMetersPerSecond) {
            MaxValue = SpeedMetersPerSecond;
            i = 1;

        } else {
            MaxValue = SpeedKmPerHour;
            i = 2;
        }
        String s = "";
        switch (i) {
            case 1:
                s = "Km/h";
                break;
            case 2:
                s = "M/h";
                break;
        }


        System.out.println("Max Speed = " + MaxValue + s);

    }


    public double CompareSpeed(int SpeedKmPerHour, int SpeedMetersPerSecond) {


        double SpeedTrsnsform = SpeedKmPerHour * 0.27777777;

        double MaxValue = 0;

        if (SpeedKmPerHour < 0 || SpeedMetersPerSecond < 0) {
            System.out.println("Speed can;t be less 0");
            logger.info("Speed can;t be less 0 from logger");
        } else if (SpeedTrsnsform < SpeedMetersPerSecond) {
            MaxValue = SpeedMetersPerSecond;
            System.out.println(MaxValue);
        } else {
            MaxValue = SpeedKmPerHour;
            System.out.println(MaxValue);

        }
        return MaxValue;

    }

    public static void main(String[] args) {
        MaxSpeed maxSpeed = new MaxSpeed();
        maxSpeed.CompareSpeed(-100, 10);

    }


}
