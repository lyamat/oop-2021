package com.company.Memento;

import com.company.Character;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
    Deque<Character> saves = new ArrayDeque<>();

    public Character getSave() {
        return saves.pop();
    }

    public void addSave(Character character) {
        saves.push(character);
    }
}
