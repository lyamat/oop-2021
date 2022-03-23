package com.company.Weapons.Factory;

import com.company.Weapons.WeaponArsenal;

public class CarStationFactory
{
    public static WeaponArsenal getInstance()
    {
        return new WeaponArsenal();
    }
}
