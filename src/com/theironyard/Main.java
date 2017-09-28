package com.theironyard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VehicleInfo car = new VehicleInfo();


        System.out.println("Enter VIN Number");
        Integer vin = scanner.nextInt();
        car.setVIN(vin);

        System.out.println("Miles from odometer?");
        Double odometer = scanner.nextDouble();
        car.setOdometer(odometer);

        System.out.println("How many gallons of gas?");
        Double consumption = scanner.nextDouble();
        car.setConsumptions(consumption);

        System.out.println("Odometer reading since last oil change?");
        Double milesSinceOil = scanner.nextDouble();
        car.setMilesSinceOil(milesSinceOil);

        System.out.println("What size is the engine?");
        Double engineSize = scanner.nextDouble();
        car.setEnginSize(engineSize);

        TelematicsService.report(car);

    }


}
