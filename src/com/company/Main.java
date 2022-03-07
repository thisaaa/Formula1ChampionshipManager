package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Formula1ChampionshipManager obj=new Formula1ChampionshipManager();
        obj.read();
	    MainMenu run=new MainMenu();
        run.options();

    }
}
