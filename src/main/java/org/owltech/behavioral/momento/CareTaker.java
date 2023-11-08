package org.owltech.behavioral.momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    public static void main(String[] args) {

        List<Memento> savedStates = new ArrayList<>();

        Originator originator = new Originator();
        originator.set("State #1");
        originator.set("State #2");

        // Saving current state
        savedStates.add(originator.saveToMemento());
        originator.set("State #3");

        // Saving current state
        savedStates.add(originator.saveToMemento());
        originator.set("State #4");

        // Restoring Originator state from saved Memento
        originator.restoreStateFromMementoObject(savedStates.get(1));
    }
}
