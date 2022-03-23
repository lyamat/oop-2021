package com.company.Interfaces;

import com.company.Enums.Location;
import com.company.Enums.WeaponType;

public interface IMemento {
    String getName();
    int getExpLevel();
    Location getLocation();
    String getWeaponName();
    WeaponType getWeaponType();
}
