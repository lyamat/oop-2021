package com.company;

import com.company.Enums.Location;
import com.company.Enums.WeaponType;
import com.company.Memento.Caretaker;
import com.company.Memento.Memento;

public class Main {

    public static void main(String[] args) throws Exception {

        try {
            Memento memento = new Memento("Ilya",
                    1, Location.WINTERFELL, "M416", WeaponType.SUBMACHINE_GUN);
            Caretaker caretaker = new Caretaker();

            memento.setAll("Ilya", 1, Location.WINTERFELL, "M416", WeaponType.SUBMACHINE_GUN);

            caretaker.addSave(memento.save());

            memento.displayCharacterState();

            memento.setAll("Danya", 2, Location.KINGS_LANDING, "AK-47", WeaponType.SHOTGUN);

            caretaker.addSave(memento.save());
            memento.displayCharacterState();

            memento.restoreToPreviousSave(caretaker.getSave());

            memento.displayCharacterState();

            memento.restoreToPreviousSave(caretaker.getSave());

            memento.displayCharacterState();

            memento.restoreToPreviousSave(caretaker.getSave());

            memento.displayCharacterState();
        }
        catch (Exception e) {
            System.out.printf("Caught exception: %s \n", e.getLocalizedMessage());
        }
    }
}