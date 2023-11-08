package org.owltech.behavioral.momento;

public class Originator {
    private String state;

    public void set(String state) {
        // set the state of the object
        this.state = state;
        System.out.println("Setting new state to = " + state);
    }

    public Memento saveToMemento() {
        // function to save the state of the object
        // and return a Memento object
        System.out.println("Saving the current state");
        return new Memento(this.state);
    }

    public void restoreStateFromMementoObject(Memento memento) {
        // function to restore from previous state
        // stored in Memento object
        this.state = memento.getState();
        System.out.println("Restored Originator's state to = " + state);
    }
}
