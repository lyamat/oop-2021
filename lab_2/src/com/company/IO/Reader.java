package com.company.IO;

import com.company.Cars.*;

import java.io.IOException;
import java.util.Scanner;

public class Reader
{
    static Scanner scanner = new Scanner(System.in);

    public static AbstractSportCar getSportCarData(CarType type)
    {
        System.out.print("Enter the brand: ");

        String brand = scanner.nextLine();

        System.out.print("Enter the price: ");

        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the maximum speed: ");

        double maxSpeed = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the number of races: ");

        int numberOfRaces = Integer.parseInt(scanner.nextLine());

        if (type == CarType.VOLVO)
        {
            return new Volvo(brand, price, maxSpeed, numberOfRaces);
        }
        else
        {
            return new Nissan(brand, price, maxSpeed, numberOfRaces);
        }
    }

    public static AbstractTruck getTruckData(CarType type)
    {
        System.out.print("Enter the brand: ");

        String brand = scanner.nextLine();

        System.out.print("Enter the price: ");

        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the maximum speed: ");

        double maxSpeed = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the capacity: ");

        double capacity = Double.parseDouble(scanner.nextLine());

        if (type == CarType.MAZ)
        {
            return new Maz(brand, price, maxSpeed, capacity);
        }
        else
        {
            return new Belaz(brand, price, maxSpeed, capacity);
        }
    }

    public static String readCommand() throws IOException
    {
        return scanner.nextLine();
    }

    public static CarType getCarType() throws Exception
    {
        System.out.println("0 - Volvo");
        System.out.println("1 - Nissan");
        System.out.println("2 - Maz");
        System.out.println("3 - Belaz");

        int type = Integer.parseInt(scanner.nextLine());

        if (type == 0)
        {
            return CarType.VOLVO;
        }
        else if (type == 1)
        {
            return CarType.NISSAN;
        }
        else if (type == 2)
        {
            return CarType.MAZ;
        }
        else if (type == 3)
        {
            return CarType.BELAZ;
        }
        else
        {
            throw new Exception("Invalid type");
        }
    }

    public static int getIdToRemove()
    {
        System.out.print("Enter the id of element to remove: ");

        return Integer.parseInt(scanner.nextLine());
    }
}
