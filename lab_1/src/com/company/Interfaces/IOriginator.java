package com.company.Interfaces;

import com.company.Character;

public interface IOriginator {
    Character save();
    void restoreToPreviousSave(Character character);
    void displayCharacterState();
}
