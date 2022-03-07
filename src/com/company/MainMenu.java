package com.company;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    static Formula1ChampionshipManager formula1ChampionshipManager = new Formula1ChampionshipManager();
    static GuiClass guiclass = new GuiClass();

    public static void options() {
        System.out.println("------------------------------");
        System.out.println("Enter 1 to add driver");
        System.out.println("Enter 2 to delete driver");
        System.out.println("Enter 3 to change driver's team");
        System.out.println("Enter 4 to view statistics");
        System.out.println("Enter 5 to view table");
        System.out.println("Enter 6 to enter race details");
        System.out.println("Enter 7 to save");
        System.out.println("Enter 8 to to veiw GUI");
        System.out.println("Enter 9 to Exit");
        System.out.println("------------------------------");

        System.out.print("Please Enter A Number : ");
        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.next();

        switch (userInput) {
            case "1":
                addDriver();
                options();
                break;
            case "2":
                deletedata();
                options();
                break;
            case "3":
                changeTeam();
                options();
                break;
            case "4":
                viewStatics();
                options();
                break;
            case "5":
                formula1ChampionshipManager.viewTable();
                options();
                break;
            case "6":
                formula1ChampionshipManager.racedata();
                options();
                break;
            case "7":
                formula1ChampionshipManager.savedetails();
                System.out.println("successfully saved details");
                options();
                break;
            case "8":
                guiclass.guiMethod();
                options();
                break;
            case "9":
                System.out.println("Thank you !");
                System.exit(0);

            default:
                System.out.println("Invalid Input !");
                options();
        }


    }


/*
* to add a driver
* @dNameInput to add driver name
* check other team name
* add driver,team and location*/
    private static void addDriver() {
        System.out.print("Please Enter Driver Name : ");
        Scanner addScanner = new Scanner(System.in);
        String dNameInput = addScanner.next();

        System.out.print("Please Enter Driver Team Name : ");
        String dTeamInput = addScanner.next();


        //to check existing teams
        while (true) {
            String tname = "no";
            for (Formula1Driver formula1Driver : Formula1ChampionshipManager.driverArray) {
                if (formula1Driver.getTeamName().equals(dTeamInput)) {
                    tname = "rptName";
                    break;
                }
            }
            if (tname=="rptName") {
                System.out.print(dTeamInput + " already added.Please add a different team name : ");
                dTeamInput = addScanner.next();
                break;
            } else {
                System.out.println(dNameInput + " successfully added to the " + dTeamInput + " team");
                break;
            }
        }

        //to get driver's location
        System.out.print("Enter Driver Location : ");
        String location = addScanner.next();
        System.out.println("Successfully added " + dNameInput + "'s details.");
        Formula1Driver i = new Formula1Driver(dNameInput, location, dTeamInput);
        formula1ChampionshipManager.driverAdd(i);

    }

    /*
     * to delete a driver
     * @dltData to get driver name who want to delete
     * delete driver all details*/

    private static void deletedata() {
        Scanner dltScanner = new Scanner(System.in);
        System.out.print("Please Enter Driver Name To Delete : ");
        String dltData = dltScanner.next();

        /*
        * in this part check the validity of entered name*/
        while (true) {
            String tname = "no";
            for (Formula1Driver formula1Driver : Formula1ChampionshipManager.driverArray) {
                if (formula1Driver.getDriverName().equals(dltData)) {
                    tname = "rptName";
                    break;
                }

            }
            if (!tname.equals("rptName")) {
                System.out.print("Couldn't find the name " + dltData + ". Please Re-Enter the correct Name : ");
                dltData = dltScanner.next();
            } else {
                break;
            }
        }
        formula1ChampionshipManager.driverDelete(dltData);
        System.out.println("Successfully deleted "+dltData+"'s data");
    }

    /*
     * to change driver's team
     * change the driver's team*/
    private static void changeTeam() {

        System.out.print("Enter Driver's Name : ");
        Scanner cScanner = new Scanner(System.in);
        String driName = cScanner.next();
        while (true) {
            String tname = "null";
            for (Formula1Driver formula1Driver : Formula1ChampionshipManager.driverArray) {
                if (formula1Driver.getDriverName().equals(driName)) {
                    tname = "rptName";
                    break;
                }

            }
            if (tname == "rptName") {

                //this scanner get the drivers Existing team name
                System.out.print("Enter Driver existing team name : ");
                String changingTeam = cScanner.next();

                for (Formula1Driver formula1Driver : Formula1ChampionshipManager.driverArray) {
                    if (changingTeam.equals(formula1Driver.getTeamName())) {
                        System.out.print("Enter new team name : ");
                        String newT = cScanner.next();
                        System.out.println(driName + " successfully added to the " + newT + " group.");


                        formula1Driver.setTeamName(newT);
                        options();


                    }


                }
                //when Existing team is not in the team array
                System.out.println("please re-check the details");
                options();
            }
            System.out.println("Couldn't find "+driName+" in driver list. Please check the details.");
            options();

        }


    }

    /*
    * to view driver statics
    * @vData mean view data
    * finally show the drivers table including name.team name,location,st position,2nd position,3rd position and points*/
        private  static void viewStatics() {
            System.out.print("Please Enter Driver Name To View Statics : ");
            Scanner vScanner = new Scanner(System.in);
            String vData = vScanner.next();

            //1st check user entered name validity
            while (true) {
                String ddname = "no";
                for (Formula1Driver formula1Driver : Formula1ChampionshipManager.driverArray) {
                    if (formula1Driver.getDriverName().equals(vData)) {
                        ddname = "rptName";
                        break;
                    }

                }
                //if user enter name is not in the driver array
                if (!ddname.equals("rptName")) {
                    System.out.print("Couldn't find the name! please enter the correct driver name : ");
                    vData = vScanner.next();
                } else {
                    break;
                }
            }
            formula1ChampionshipManager.viewStatistics(vData);
        }


}
