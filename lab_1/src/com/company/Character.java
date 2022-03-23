package com.company;

import com.company.Enums.Location;
import com.company.Enums.WeaponType;
import com.company.Interfaces.IMemento;

public class Character implements IMemento {
    private String name;
    private int expLevel;
    private Location location;
    private String weaponName;
    private WeaponType weaponType;

    @Override
    public WeaponType getWeaponType() { return weaponType; }

    @Override
    public String getName() { return name; }

    @Override
    public int getExpLevel() {
        return expLevel;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public String getWeaponName() {
        return weaponName;
    }

    public Character(String name, int expLevel, Location location, String weaponName, WeaponType weaponType) {
        this.name = name;
        this.expLevel = expLevel;
        this.location = location;
        this.weaponName = weaponName;
        this.weaponType = weaponType;
    }
}
