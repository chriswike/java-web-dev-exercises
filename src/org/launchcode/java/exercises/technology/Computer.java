package org.launchcode.java.exercises.technology;

public class Computer extends AbstractEntity {

    private int ram;
    private int storage;
    private boolean hasWebcam;

    public Computer (int storage, int ram, boolean hasWebcam) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasWebcam = hasWebcam;
    }

    public void increaseRam (int n) {
        this.ram = this.ram +n;
    }

    public void increaseStorage(int x) {
        this.storage = this.storage +x;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isHasWebcam() {
        return hasWebcam;
    }

    public void setHasWebcam(boolean hasWebcam) {
        this.hasWebcam = hasWebcam;
    }
}
