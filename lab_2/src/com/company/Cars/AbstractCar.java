package com.company.Cars;

public abstract class AbstractCar
{
    double price;

    String brand;

    double maxSpeed;

    int id;

    CarType type;

    public double getPrice()
    {
        return price;
    }

    public String getBrand()
    {
        return brand;
    }

    public double getMaxSpeed()
    {
        return maxSpeed;
    }

    public int getId() { return id; }

    public String getCarType()
    {
        switch (type)
        {
            case NISSAN:
                return "Nissan";
            case VOLVO:
                return "Volvo";
            case MAZ:
                return "Maz";
            default:
                return "Belaz";
        }
    }
}
