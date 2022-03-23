package com.company.Enums;

public enum WeaponType {
    ASSAULT_RIFLE,
    SUBMACHINE_GUN,
    SNIPER_RIFLE,
    SHOTGUN,
    KNIFE;

    @Override
    public String toString(){
        switch(this) {
            case ASSAULT_RIFLE:
                return "Assault Rifle";
            case SUBMACHINE_GUN:
                return "Submachine Gun";
            case SNIPER_RIFLE:
                return "Sniper Rifle";
            case SHOTGUN:
                return "Shotgun";
            case KNIFE:
                return "Knife";
            default:
                return "none";
        }
    }
}
