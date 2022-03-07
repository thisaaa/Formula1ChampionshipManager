package com.company;

public class Formula1Driver extends Driver{

    private int first_positions;
    private int second_positions;
    private int third_positions;
    private int fourth_positions;
    private int fifth_positions;
    private int sixth_positions;
    private int seventh_positions;
    private int eightth_positions;
    private int nineth_positions;
    private int tenth_positions;
    private  int race_count;
    private  int total_points;
    private int Nf_positions;
    private int Ns_positions;
    private int Nt_positions;
    private int Nrace_count;
    private  int Ntotal_points;

    private int probF_position;
    private String winningProb;
    private String dRace;




    public Formula1Driver(String driverName, String location, String teamName) {
        super(driverName, location, teamName);
    }
    public Formula1Driver(String driverName, String location, String teamName,int first_positions, int second_positions, int third_positions,int fourth_positions,int fifth_positions,
                          int sixth_positions,int seventh_positions,int eightth_positions,int nineth_positions,int tenth_positions, int race_count, int total_points,
                          int Nf_positions,int Ns_positions,int Nt_positions,int Nrace_count,int Ntotal_points,int probF_position,String winningProb,String dRace) {
        super(driverName, location, teamName);
        this.first_positions = first_positions;
        this.second_positions = second_positions;
        this.third_positions = third_positions;
        this.fourth_positions = fourth_positions;
        this.fifth_positions = fifth_positions;
        this.sixth_positions = sixth_positions;
        this.seventh_positions = seventh_positions;
        this.eightth_positions = eightth_positions;
        this.nineth_positions = nineth_positions;
        this.third_positions = tenth_positions;
        this.Nrace_count=Nrace_count;
        this.Ntotal_points=Ntotal_points;
        this.race_count = race_count;
        this.total_points = total_points;
        this.winningProb=winningProb;
        this.probF_position=probF_position;
        this.dRace=dRace;
    }

    public int getFirst_positions() {
        return first_positions;
    }

    public void setFirst_positions(int first_positions) {
        this.first_positions = first_positions;
    }

    public int getSecond_positions() {
        return second_positions;
    }

    public void setSecond_positions(int second_positions) {
        this.second_positions = second_positions;
    }

    public int getThird_positions() {
        return third_positions;
    }

    public void setThird_positions(int third_positions) {
        this.third_positions = third_positions;
    }

    public int getRace_count() {
        return race_count;
    }

    public void setRace_count(int race_count) {
        this.race_count = race_count;
    }

    public int getTotal_points() {
        return total_points;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

    public int getFourth_positions() {
        return fourth_positions;
    }

    public void setFourth_positions(int fourth_positions) {
        this.fourth_positions = fourth_positions;
    }

    public int getFifth_positions() {
        return fifth_positions;
    }

    public void setFifth_positions(int fifth_positions) {
        this.fifth_positions = fifth_positions;
    }

    public int getSixth_positions() {
        return sixth_positions;
    }

    public void setSixth_positions(int sixth_positions) {
        this.sixth_positions = sixth_positions;
    }

    public int getSeventh_positions() {
        return seventh_positions;
    }

    public void setSeventh_positions(int seventh_positions) {
        this.seventh_positions = seventh_positions;
    }

    public int getEightth_positions() {
        return eightth_positions;
    }

    public void setEightth_positions(int eightth_positions) {
        this.eightth_positions = eightth_positions;
    }

    public int getNineth_positions() {
        return nineth_positions;
    }

    public void setNineth_positions(int nineth_positions) {
        this.nineth_positions = nineth_positions;
    }

    public int getTenth_positions() {
        return tenth_positions;
    }

    public void setTenth_positions(int tenth_positions) {
        this.tenth_positions = tenth_positions;
    }

    public String getdRace() {
        return dRace;
    }

    public void setdRace(String dRace) {
        this.dRace = dRace;
    }

    public int getNf_positions() {
        return Nf_positions;
    }

    public void setNf_positions(int nf_positions) {
        Nf_positions = nf_positions;
    }

    public int getNs_positions() {
        return Ns_positions;
    }

    public void setNs_positions(int ns_positions) {
        Ns_positions = ns_positions;
    }

    public int getNt_positions() {
        return Nt_positions;
    }

    public void setNt_positions(int nt_positions) {
        Nt_positions = nt_positions;
    }

    public int getNrace_count() {
        return Nrace_count;
    }

    public void setNrace_count(int nrace_count) {
        Nrace_count = nrace_count;
    }

    public int getNtotal_points() {
        return Ntotal_points;
    }

    public void setNtotal_points(int ntotal_points) {
        Ntotal_points = ntotal_points;
    }

    public int getProbF_position() {
        return probF_position;
    }

    public void setProbF_position(int probF_position) {
        this.probF_position = probF_position;
    }

    public String getWinningProb() {
        return winningProb;
    }

    public void setWinningProb(String winningProb) {
        this.winningProb = winningProb;
    }
}
