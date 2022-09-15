package org.launchcode.java.exercises.technology;

public class SmartPhone extends Computer{

    private int numberOfContacts;
    public SmartPhone(int storage, int ram, boolean hasWebcam, int numberOfContacts) {
        super(storage, ram, hasWebcam);
        this.numberOfContacts = numberOfContacts;
    }
}
