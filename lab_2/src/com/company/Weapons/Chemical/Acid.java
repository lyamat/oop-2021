package com.company.Weapons.Chemical;

import com.company.MainMenu;
import com.company.Weapons.WeaponType;

public class Acid extends AbstractChemicalWeapon {
    protected double toxityCoefficient;

    public Acid(String description, double price, double rarity, int toxity) {
        setDescription(description);
        setPrice(price);
        setRarity(rarity);
        this.toxity = toxity;
        toxityCoefficient = 3;
        id = MainMenu.id++;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Acid: {" +
                "price = " + getPrice() +
                '}';
    }
}
