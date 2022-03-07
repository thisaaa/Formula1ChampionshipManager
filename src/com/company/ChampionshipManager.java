package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ChampionshipManager {
    void driverAdd(Formula1Driver formula1driver );
    void driverDelete(String remove);
    void changeTheTeam();
    void viewStatistics(String stats);
    void viewTable();
    void racedata();
    void savedetails() ;
    void read() throws FileNotFoundException;
}
