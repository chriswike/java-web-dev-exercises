package org.launchcode.java.exercises.technology;

public class Program {
    public static void main (String[] args) {

        Laptop myLaptop = new Laptop(2, 5,true, 5);

        System.out.println("My laptop has " + myLaptop.getStorage() + "and " + myLaptop.getId() + "and " + myLaptop.getRam());
    }
}
