package com.company;

import com.company.Cars.*;
import com.company.IO.Reader;
import com.company.IO.Writer;

public class MainMenu
{
    public static int id = 0;

    public static void main(String[] args)
    {
        CarStation station = CarStationFactory.getInstance();

        station.addCar(new Volvo("x3", 123, 123, 7));
        station.addCar(new Nissan("x2", 456, 777, 9));
        station.addCar(new Maz("t4", 444, 111, 9.123));
        station.addCar(new Belaz("b1", 444, 111, 55.66));

        boolean runApp = true;

        String command = "";

        while(runApp)
        {
            try
            {
                Writer.printCars(station.getCars());

                Writer.printCommands();

                command = Reader.readCommand();

                switch (command)
                {
                    case "a":
                        CarType type = Reader.getCarType();

                        switch (type)
                        {
                            case VOLVO:
                                station.addCar(CarFactory.getInstance(CarType.VOLVO));
                                break;
                            case NISSAN:
                                station.addCar(CarFactory.getInstance(CarType.NISSAN));
                                break;
                            case MAZ:
                                station.addCar(CarFactory.getInstance(CarType.MAZ));
                                break;
                            case BELAZ:
                                station.addCar(CarFactory.getInstance(CarType.BELAZ));
                                break;
                        }
                        break;
                    case "r":
                        station.removeCar(Reader.getIdToRemove());
                        break;
                    case "g":
                        System.out.printf("\nTotal price: %.2f\n", station.getTotalPrice());
                        break;
                    case "q":
                        runApp = false;
                        break;
                }

                Writer.printDelimiter();
            }
            catch (Exception e)
            {
                System.out.println("\n" + e.getMessage());
                Writer.printDelimiter();
            }
        }
    }
}
