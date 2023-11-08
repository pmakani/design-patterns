package org.owltech.behavioral.momento;

public class Memento {
    private final String state;

    public Memento(String state_to_save) {
        this.state = state_to_save;
    }

    public String getState() {
        return state;
    }
}
