package com.company.Weapons;

public abstract class AbstractWeapon {

    private double price;

    private String description;

    private double rarity;

    private int id;

    public double getPrice() {
        return price;
    }

    public int getId() { return id; }

    public void setPrice(double value){
        price = value;
    }
    public void setDescription(String value){
        description = value;
    }

    public void setRarity(double value){
        rarity = value;
    }

    public void setId(int value){
        id = value;
    }
}
