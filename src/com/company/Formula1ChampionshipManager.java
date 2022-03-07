package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Formula1ChampionshipManager implements ChampionshipManager{

    public static ArrayList<Formula1Driver> driverArray= new ArrayList<>();
    static ArrayList<Formula1Driver> teamArray= new ArrayList<>();

    static File saveFile=new File("saveFile.txt");

    @Override
    //assign user input details to the arrays
    public void driverAdd(Formula1Driver formula1Driver) {
        driverArray.add(formula1Driver);
        teamArray.add(formula1Driver);
    }

    @Override
    //remove driver name
    public void driverDelete(String remove) {
        if (driverArray.size() == 0) {
            System.out.println("No drivers to remove in driver list");
        } else {
            for (int x = 0; x < driverArray.size(); x++){
                if (driverArray.get(x).getDriverName().equals(remove)){
                    driverArray.remove(x);
                    break;
                }
            }
        }

    }

    @Override
    public void changeTheTeam() {

    }

    @Override
    public void viewStatistics(String stats) {
        for (Formula1Driver formula1Driver:driverArray){
            if (formula1Driver.getDriverName().equals(stats)){
                String Table = "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s|%-15s | %n";
                System.out.format("----------------------------------------------------------------------------------------------------------------------------------------------%n");
                System.out.format("| Driver Name     |  Team Name      |   Location      |    Points       |1st positions    |2nd positions    |3rd positions   | race count     |%n");
                System.out.format("------------------|-----------------|-----------------|-----------------|-----------------|-----------------|----------------|----------------%n");

                System.out.format(Table,formula1Driver.getDriverName(),formula1Driver.getTeamName(),formula1Driver.getLocation(),formula1Driver.getTotal_points(),formula1Driver.getFirst_positions(),formula1Driver.getSecond_positions(),formula1Driver.getThird_positions(),formula1Driver.getRace_count());
            }
        }

    }

    @Override
    public void viewTable() {


                String Table = "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s|%-15s | %n";
                System.out.format("----------------------------------------------------------------------------------------------------------------------------------------------%n");
                System.out.format("| Driver Name     |  Team Name      |   Location      |    Points       |1st positions    |2nd positions    |3rd positions   | race count     |%n");
                System.out.format("------------------|-----------------|-----------------|-----------------|-----------------|-----------------|----------------|----------------%n");
                driverArray.sort(new RaceSorter());
                 for (Formula1Driver formula1Driver:driverArray){
                System.out.format(Table,formula1Driver.getDriverName(),formula1Driver.getTeamName(),formula1Driver.getLocation(),formula1Driver.getTotal_points(),formula1Driver.getFirst_positions(),formula1Driver.getSecond_positions(),formula1Driver.getThird_positions(),formula1Driver.getRace_count());
            }

    }

    @Override
    public void racedata() {
        System.out.println("please enter details of race");
        //get race date details
        Scanner dateScanner=new Scanner(System.in);
        System.out.print("enter Year : ");
        int raceYInput = dateScanner.nextInt();
        System.out.print("enter Month : ");
        int raceMInput = dateScanner.nextInt();
        System.out.print("enter date : ");
        int raceDInput = dateScanner.nextInt();

        String racedate=(raceYInput+"/"+raceMInput+"/"+raceDInput);


        System.out.println("race date is "+raceYInput+"/"+raceMInput+"/"+raceDInput);
        for (Formula1Driver formula1Driver:driverArray){
            formula1Driver.setdRace(
                    racedate
            );
            for(int j=0;j<driverArray.size();j++){
                System.out.print("please enter "+formula1Driver.getDriverName()+"'s position :");
                break;
            }

            Scanner rpScanner=new Scanner(System.in);
            int rpInput = rpScanner.nextInt();


            if (rpInput ==1) {
                formula1Driver.setNf_positions(1);
                int total_fPoints=formula1Driver.getFirst_positions()+formula1Driver.getNf_positions();
                formula1Driver.setFirst_positions(total_fPoints);

                formula1Driver.setNtotal_points(25);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==2){
                formula1Driver.setNs_positions(1);
                int total_sPoints=formula1Driver.getSecond_positions()+formula1Driver.getNs_positions();
                formula1Driver.setSecond_positions(total_sPoints);

                formula1Driver.setNtotal_points(18);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }
            else if (rpInput==3){
                formula1Driver.setNt_positions(1);
                int total_tPoints=formula1Driver.getThird_positions()+formula1Driver.getNt_positions();
                formula1Driver.setThird_positions(total_tPoints);

                formula1Driver.setNtotal_points(15);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==4){

                formula1Driver.setNtotal_points(12);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==5){

                formula1Driver.setNtotal_points(10);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==6){

                formula1Driver.setNtotal_points(8);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==7){

                formula1Driver.setNtotal_points(6);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==8){

                formula1Driver.setNtotal_points(4);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==9){

                formula1Driver.setNtotal_points(2);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==10){

                formula1Driver.setNtotal_points(1);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }


        }

    }



    //random dace
    public void randomRaceData() {
        Random randRace = new Random();
        int randDay = randRace.nextInt(31);
        int randMonth = randRace.nextInt(12);
        int randYear = randRace.nextInt(2022-2020)+2020;

        String randDate=(randYear+"/"+randMonth+"/"+randDay);


        for (Formula1Driver formula1Driver:driverArray){
            formula1Driver.setdRace(
                    randDate
            );

            int rpInput = randRace.nextInt(10);


            if (rpInput ==1) {

                formula1Driver.setNf_positions(1);
                int total_fPoints=formula1Driver.getFirst_positions()+formula1Driver.getNf_positions();
                formula1Driver.setFirst_positions(total_fPoints);

                formula1Driver.setNtotal_points(25);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==2){
                formula1Driver.setNs_positions(1);
                int total_sPoints=formula1Driver.getSecond_positions()+formula1Driver.getNs_positions();
                formula1Driver.setSecond_positions(total_sPoints);

                formula1Driver.setNtotal_points(18);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }
            else if (rpInput==3){
                formula1Driver.setNt_positions(1);
                int total_tPoints=formula1Driver.getThird_positions()+formula1Driver.getNt_positions();
                formula1Driver.setThird_positions(total_tPoints);

                formula1Driver.setNtotal_points(15);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==4){

                formula1Driver.setNtotal_points(12);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==5){

                formula1Driver.setNtotal_points(10);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==6){

                formula1Driver.setNtotal_points(8);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==7){

                formula1Driver.setNtotal_points(6);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==8){

                formula1Driver.setNtotal_points(4);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==9){

                formula1Driver.setNtotal_points(2);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }else if (rpInput==10){

                formula1Driver.setNtotal_points(1);
                int total_Points=formula1Driver.getTotal_points()+ formula1Driver.getNtotal_points();
                formula1Driver.setTotal_points(total_Points);

                formula1Driver.setNrace_count(1);
                int total_count=formula1Driver.getNrace_count()+ formula1Driver.getRace_count();
                formula1Driver.setRace_count(total_count);
            }


        }

    }public void probSubMethod() {
        Random prob = new Random();
        for (Formula1Driver formula1Driver : driverArray) {
            int startPos = prob.nextInt(10);
            formula1Driver.setProbF_position(startPos);

            if (startPos == 1) {
                formula1Driver.setWinningProb("40%");
                formula1Driver.setProbF_position(1);

            }else if (startPos == 2) {
                formula1Driver.setWinningProb("30%");
                formula1Driver.setProbF_position(2);


            }else if (startPos == 3) {
                formula1Driver.setWinningProb("20%");
                formula1Driver.setProbF_position(3);


            }else if (startPos == 4) {
                formula1Driver.setWinningProb("20%");
                formula1Driver.setProbF_position(4);


            }else if (startPos == 5) {
                formula1Driver.setWinningProb("2%");
                formula1Driver.setProbF_position(5);


            }else if (startPos == 6) {
                formula1Driver.setWinningProb("2%");
                formula1Driver.setProbF_position(6);


            }else if (startPos == 7) {
                formula1Driver.setWinningProb("2%");
                formula1Driver.setProbF_position(7);


            }else if (startPos == 8) {
                formula1Driver.setWinningProb("2%");
                formula1Driver.setProbF_position(8);


            }else if (startPos == 9) {
                formula1Driver.setWinningProb("2%");
                formula1Driver.setProbF_position(9);


            }else if (startPos == 10) {
                formula1Driver.setWinningProb("0%");
                formula1Driver.setProbF_position(10);


            }
        }

    }
    @Override
    public void savedetails() {
        try {
            File saveFile = new File("saveFile.txt");
            saveFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ObjectOutputStream detailStore = new ObjectOutputStream(new FileOutputStream(saveFile));
                detailStore.writeObject(driverArray);

                detailStore.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void read() throws FileNotFoundException{
//get the file details
        try {
            File readfile=new File("saveFile.txt");
            readfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


//to read the file
        try {
            ObjectInputStream rFile=new ObjectInputStream(new FileInputStream(saveFile));
            driverArray=(ArrayList<Formula1Driver>) rFile.readObject();
            rFile.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }



}
