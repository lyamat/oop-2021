package com.company.Weapons.Cold;

import com.company.MainMenu;
import com.company.Weapons.WeaponType;

public class LongSleave extends AbstractColdWeapon {
    protected double sharpnessCoefficient;

    public LongSleave(String description, double price, double rarity, double sharpness) {
        setDescription(description);
        setPrice(price);
        setRarity(rarity);
        this.sharpness = sharpness;
        sharpnessCoefficient = 7;
        id = MainMenu.id++;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "LongSleave: {" +
                "price = " + getPrice() +
                '}';
    }
}
