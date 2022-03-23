package com.company.Cars;

import com.company.MainMenu;

public class Volvo extends AbstractSportCar
{
    protected double acceleration;

    public Volvo(String brand, double price, double maxSpeed, int numberOfRaces)
    {
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.numberOfRaces = numberOfRaces;
        acceleration = 5;
        type = CarType.VOLVO;
        id = MainMenu.id++;
    }

    public double getMaxSpeed()
    {
        return acceleration * maxSpeed;
    }
}
