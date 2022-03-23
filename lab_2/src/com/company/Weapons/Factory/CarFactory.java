package com.company.Weapons.Factory;

import com.company.IO.Reader;
import com.company.Weapons.AbstractWeapon;
import com.company.Weapons.WeaponType;

public class CarFactory
{
    public static AbstractWeapon getInstance(WeaponType type)
    {
        switch (type)
        {
            case ACID:
                return Reader.getChemicalWeaponData(type);
            case GAS:
                return Reader.getChemicalWeaponData(type);
            case BUTTERFLY:
                return Reader.getColdWeaponData(type);
            case LONGSLEAVE:
                return Reader.getColdWeaponData(type);
            default:
                return Reader.getColdWeaponData(type);
        }
    }
}
