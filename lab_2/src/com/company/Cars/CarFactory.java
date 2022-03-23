package com.company.Cars;

import com.company.IO.Reader;

public class CarFactory
{
    public static AbstractCar getInstance(CarType type)
    {
        switch (type)
        {
            case VOLVO:
                return Reader.getSportCarData(type);
            case NISSAN:
                return Reader.getSportCarData(type);
            case MAZ:
                return Reader.getTruckData(type);
            case BELAZ:
                return Reader.getTruckData(type);
            default:
                return Reader.getTruckData(type);
        }
    }
}
