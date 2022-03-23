package com.company.Cars;

import com.company.MainMenu;

public class Belaz extends AbstractTruck
{
    protected double capacityCoefficient;

    public Belaz(String brand, double price, double maxSpeed, double capacity)
    {
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        capacityCoefficient = 123;
        type = CarType.BELAZ;
        id = MainMenu.id++;
    }

    public double getCapacity()
    {
        return capacityCoefficient * capacity;
    }
}
