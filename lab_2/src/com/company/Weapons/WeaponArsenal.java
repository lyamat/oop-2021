package com.company.Weapons;

import javax.management.InstanceNotFoundException;
import java.util.ArrayList;

public class WeaponArsenal
{
    private ArrayList<AbstractWeapon> _weapons;

    public WeaponArsenal()
    {
        _weapons = new ArrayList<AbstractWeapon>();
    }

    public ArrayList<AbstractWeapon> getWeapons()
    {
        return _weapons;
    }

    public void addWeapon(AbstractWeapon weapon)
    {
        _weapons.add(weapon);
    }

    public void removeWeapon(int id) throws InstanceNotFoundException
    {
        for (AbstractWeapon weapon : _weapons)
        {
            if (weapon.getId() == id)
            {
                _weapons.remove(weapon);
                return;
            }
        }

        throw new InstanceNotFoundException("Weapon wasn't found");
    }

    public double getTotalPrice()
    {
        double sum = 0;

        for (AbstractWeapon weapon : _weapons)
        {
            sum += weapon.getPrice();
        }

        return sum;
    }

}
