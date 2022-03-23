package com.company.Cars;

import javax.management.InstanceNotFoundException;
import java.util.ArrayList;

public class CarStation
{
    private ArrayList<AbstractCar> _cars;

    public CarStation()
    {
        _cars = new ArrayList<AbstractCar>();
    }

    public ArrayList<AbstractCar> getCars()
    {
        return _cars;
    }

    public void addCar(AbstractCar car)
    {
        _cars.add(car);
    }

    public void removeCar(int id) throws InstanceNotFoundException
    {
        for (AbstractCar car : _cars)
        {
            if (car.getId() == id)
            {
                _cars.remove(car);
                return;
            }
        }

        throw new InstanceNotFoundException("Vehicle was not found");
    }

    public double getTotalPrice()
    {
        double sum = 0;

        for (AbstractCar car : _cars)
        {
            sum += car.getPrice();
        }

        return sum;
    }

}
