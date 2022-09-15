package org.launchcode.java.exercises.technology;

public class Laptop extends Computer {

    private double weight;

    public Laptop (int storage, int ram, boolean hasWebcam, double weight) {
        super (storage,ram,hasWebcam);
        this.weight = weight;
    }
}
