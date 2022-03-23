package com.company.IO;

import com.company.Cars.*;

import java.util.ArrayList;

public class Writer
{
    public static void printCar(AbstractCar car) {
        if (car instanceof AbstractSportCar) {
            System.out.printf("id: %-5d type:%-10s brand: %-10s price: %-10.2f MaxSpeed: %-8.2f Number of races: %-5d\n",
                    car.getId(), car.getCarType(), car.getBrand(), car.getPrice(),
                    car.getMaxSpeed(), ((AbstractSportCar) car).getNumberOfRaces());
        }
        else {
            System.out.printf("id: %-5d type:%-10s brand: %-10s price: %-10.2f MaxSpeed: %-8.2f Capacity: %-5.2f\n",
                    car.getId(), car.getCarType(), car.getBrand(), car.getPrice(),
                    car.getMaxSpeed(), ((AbstractTruck) car).getCapacity());
        }
    }

    public static void printCars(ArrayList<AbstractCar> cars)
    {
        for(AbstractCar car : cars)
        {
            printCar(car);
        }
    }

    public static void printCommands()
    {
        System.out.println("\na - add");
        System.out.println("r - remove");
        System.out.println("g - get total price");
        System.out.println("q - exit");
    }

    public static void printDelimiter()
    {
        System.out.println("===========================================");
    }
}
