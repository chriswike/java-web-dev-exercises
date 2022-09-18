package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {
    public int compare (Topping t1, Topping t2) {
        return t1.getName().compareTo(t2.getName());
    }
}
