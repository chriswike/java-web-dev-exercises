package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a radius: ");
    Double radius = input.nextDouble();
    if(radius.isNaN() ){
        System.err.println("Wrong Input");
        return;
        System.out.println("The area of a circle of radius is: " + (Circle.getArea(radius)));
        }
        input.close();
    }
}