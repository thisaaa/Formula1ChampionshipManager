package com.company;

import java.util.Comparator;

public class RaceSorter implements Comparator <Formula1Driver>{


    /*
     * to get ascending order table
     * pass to the GUI class */
    @Override
    public int compare(Formula1Driver first_positions, Formula1Driver second_positions) {
        if (first_positions.getTotal_points()>second_positions.getTotal_points()){
            return -1;
        }else if(first_positions.getTotal_points()<second_positions.getTotal_points()){
            return 1;
        }else {
            if (first_positions.getNf_positions() > second_positions.getNs_positions()) {
                return -1;
            } else if (first_positions.getNf_positions() < second_positions.getNs_positions()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
