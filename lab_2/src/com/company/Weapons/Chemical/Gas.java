package com.company.Weapons.Chemical;

import com.company.MainMenu;
import com.company.Weapons.WeaponType;

public class Gas extends AbstractChemicalWeapon {
    protected double toxityCoefficient;

    public Gas(String description, double price, double rarity, int toxity) {
        setDescription(description);
        setPrice(price);
        setRarity(rarity);
        this.toxity = toxity;
        toxityCoefficient = 5;
        id = MainMenu.id++;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Gas: {" +
                "price = " + getPrice() +
                '}';
    }
}
