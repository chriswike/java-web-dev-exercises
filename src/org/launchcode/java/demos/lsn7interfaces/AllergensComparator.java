package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class AllergensComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone a1, Cone a2) {
        if (a1.getAllergens().contains("none")) {
            return 1;
        } else {
            return 0;
        }
    }
}