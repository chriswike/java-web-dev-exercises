package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());
        cones.sort(new AllergensComparator());

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nFlavors");
        for (Flavor flavor : flavors) System.out.println(flavor.getName());

        System.out.println("\nCone Cost");
        for (Cone cone : cones) System.out.println(cone.getName() + ": $" + cone.getCost());

        System.out.println("\nAllergens");
        for (Flavor flavor : flavors) System.out.println(cone.getAllergens());
    }
}