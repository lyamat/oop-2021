package com.company.Memento;

import com.company.Character;
import com.company.Enums.Location;
import com.company.Enums.WeaponType;
import com.company.Interfaces.IOriginator;

public class Memento implements IOriginator {

    private String name;
    private int expLevel;
    private Location location;
    private String weaponName;
    private WeaponType weaponType;

    public void setAll(String name, int expLevel,Location location, String weaponName,WeaponType weaponType){
        setWeaponType(weaponType);
        setWeaponName(weaponName);
        setName(name);
        setExpLevel(expLevel);
        setLocation(location);
    }

    private void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    private void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }

    private void setLocation(Location location) {
        this.location = location;
    }

    public Memento(String name, int expLevel, Location location, String weaponName, WeaponType weaponType) {
        this.name = name;
        this.expLevel = expLevel;
        this.location = location;
        this.weaponName = weaponName;
        this.weaponType = weaponType;
    }

    @Override
    public Character save(){
        System.out.println("Saving Character Details...\n");
        Character character = new Character(name,expLevel,location,
                weaponName,weaponType);
        return character;
    }

    @Override
    public void restoreToPreviousSave(Character character){
        System.out.println("Getting Last Save (remove)\n");
        name = character.getName();
        expLevel = character.getExpLevel();
        location = character.getLocation();
        weaponName = character.getWeaponName();
        weaponType = character.getWeaponType();
    }

    @Override
    public void displayCharacterState(){
        System.out.println("=========================\n" +
                "Character Details: \nPlayer Name: " + name
                + "\nExperience Level: " + expLevel + "\nLocation: "
                + location + "\nWeapon Name: " + weaponName
                + "\nWeapon Type: " + weaponType +
                "\n=========================\n");
    }
}
