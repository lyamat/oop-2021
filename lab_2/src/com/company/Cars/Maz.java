package com.company.Cars;

import com.company.MainMenu;

public class Maz extends AbstractTruck
{
    protected double capacityCoefficient;

    public Maz(String brand, double price, double maxSpeed, double capacity)
    {
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        capacityCoefficient = 5;
        type = CarType.MAZ;
        id = MainMenu.id++;
    }

    public double getCapacity()
    {
        return capacityCoefficient * capacity;
    }
}
