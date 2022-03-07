package com.company;

import com.company.Formula1ChampionshipManager;
import com.company.Formula1Driver;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import static com.company.Formula1ChampionshipManager.driverArray;

public class GuiClass {
    public void guiMethod() {


            JFrame f1Gui = new JFrame();

        f1Gui.setTitle("Formula 1 championship - 2022");
        f1Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label;
        label = new JLabel("F1 ");
        label.setBounds(630, 5, 500, 200);
        label.setFont(new Font("Arial black", Font.ITALIC, 150));
        label.setForeground(Color.WHITE);

        f1Gui.add(label);

        JLabel label1;
        label1 = new JLabel("#f1championship2022 ");
        label1.setBounds(627, 80, 500, 200);
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        label1.setForeground(Color.WHITE);

        f1Gui.add(label1);

        JLabel background;
        ImageIcon img=new ImageIcon("D:\\iit\\oop\\cw\\bg1.jpg");
        background=new JLabel("",img,JLabel.CENTER);



        JButton asc=new JButton("Ascending Order ");
        asc.setFont(new Font("Arial", Font.BOLD, 20));
        asc.setBackground(Color.BLACK);
        asc.setForeground(Color.WHITE);

        asc.setBorder(new RoundBtn(15));
        asc.setBounds(500,270,450,50);

        f1Gui.add(asc);
        asc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acsMehod();

            }

        });

            JButton dsc=new JButton("Descending Order ");
            dsc.setFont(new Font("Arial", Font.BOLD, 20));
            dsc.setBounds(500,350,450,50);
            dsc.setBackground(Color.BLACK);
            dsc.setForeground(Color.WHITE);
            dsc.setBorder(new RoundBtn(15));

            f1Gui.add(dsc);
            dsc.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                            dscMethod();

                    }
            });


        JButton rnd=new JButton("Random Race");
        rnd.setFont(new Font("Arial", Font.BOLD, 20));
        rnd.setBounds(500,430,450,50);
        rnd.setBackground(Color.BLACK);
        rnd.setForeground(Color.WHITE);
        rnd.setBorder(new RoundBtn(15));

        f1Gui.add(rnd);
        rnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomMethod();

            }
        });

        JButton srch=new JButton("Search Driver");
        srch.setFont(new Font("Arial", Font.BOLD, 20));
        srch.setBounds(500,510,450,50);
        srch.setBackground(Color.BLACK);
        srch.setForeground(Color.WHITE);
        srch.setBorder(new RoundBtn(15));

        f1Gui.add(srch);
        srch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchDriver();

            }
        });
        JButton dte=new JButton("Race Dates ");
        dte.setFont(new Font("Arial", Font.BOLD, 20));
        dte.setBounds(500,590,450,50);
        dte.setBackground(Color.BLACK);
        dte.setForeground(Color.WHITE);
        dte.setBorder(new RoundBtn(15));

        f1Gui.add(dte);
        dte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dateRace();

            }
        });

        JButton prob=new JButton("View Probability ");
        prob.setFont(new Font("Arial", Font.BOLD, 20));
        prob.setBounds(500,670,450,50);
        prob.setBackground(Color.BLACK);
        prob.setForeground(Color.WHITE);
        prob.setBorder(new RoundBtn(15));

        f1Gui.add(prob);
        prob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                raceProb();

            }
        });



            f1Gui.add(new JScrollPane());
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            f1Gui.setSize(screenSize.width, screenSize.height);

            //jTbl.setAutoCreateRowSorter(true);


            f1Gui.add(background);

            f1Gui.setVisible(true);


    }
    /*
    * to show race details in ascending details*/
    public void acsMehod(){
        JFrame f1Gui1 = new JFrame("  Ascending Order");

        //f1Gui1.setForeground(Color.red);


        f1Gui1.setLocationRelativeTo(null);
        DefaultTableModel mainTable = new DefaultTableModel();
        JTable jTbl = new JTable(mainTable);
        jTbl.setRowHeight(27);
        jTbl.setBackground(Color.darkGray);
        jTbl.setForeground(Color.white);

        jTbl.setFont(new Font("Arial", Font.PLAIN, 18));



        JTableHeader tableHeader = jTbl.getTableHeader();
        tableHeader.setBackground(Color.black);
        tableHeader.setForeground(Color.white);
        tableHeader.setSize(0,29);
        Font headerFont = new Font("Verdana", Font.PLAIN, 17);
        tableHeader.setFont(headerFont);

        mainTable.addColumn("Driver Name");
        mainTable.addColumn("Team Name");
        mainTable.addColumn("Location");
        mainTable.addColumn("1st positions");
        mainTable.addColumn("2nd positions");
        mainTable.addColumn("3rd positions");
        mainTable.addColumn("Total Points");

        driverArray.sort(new RaceSorter());

        for (Formula1Driver formula1Driver : driverArray) {
            mainTable.insertRow(0, new Object[]{formula1Driver.getDriverName(), formula1Driver.getTeamName(), formula1Driver.getLocation(),
                    formula1Driver.getFirst_positions(),formula1Driver.getSecond_positions(),formula1Driver.getThird_positions(),formula1Driver.getTotal_points()});

        }
        JButton asc=new JButton("Close");
        asc.setBounds(320,350,250,50);
        asc.setFont(new Font("Arial", Font.BOLD, 20));

        asc.setBackground(Color.white);
        asc.setForeground(Color.BLACK);

        asc.setBorder(new RoundBtn(15));

        f1Gui1.add(asc);

        asc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1Gui1.dispose();


            }
        });

        jTbl.setBounds(50,50,800,400);
        f1Gui1.add(new JScrollPane(jTbl));


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        f1Gui1.setSize(900,500);





        f1Gui1.setLocationRelativeTo(null);




        f1Gui1.setVisible(true);
    }
    /*
     * to show race details in descending details*/
        public void dscMethod(){
                JFrame f1Gui = new JFrame("  Descending Order");

            f1Gui.setLocationRelativeTo(null);
            DefaultTableModel mainTable = new DefaultTableModel();
            JTable jTbl = new JTable(mainTable);
            jTbl.setRowHeight(27);
            jTbl.setBackground(Color.darkGray);
            jTbl.setForeground(Color.white);

            jTbl.setFont(new Font("Arial", Font.PLAIN, 18));



            JTableHeader tableHeader = jTbl.getTableHeader();
            tableHeader.setBackground(Color.black);
            tableHeader.setForeground(Color.white);
            tableHeader.setSize(0,29);
            Font headerFont = new Font("Verdana", Font.PLAIN, 17);
            tableHeader.setFont(headerFont);




            mainTable.addColumn("Driver Name");
            mainTable.addColumn("Team Name");
            mainTable.addColumn("Location");
            mainTable.addColumn("1st positions");
            mainTable.addColumn("2nd positions");
            mainTable.addColumn("3rd positions");
            mainTable.addColumn("Total Points");

            driverArray.sort(new DscSorter());

            for (Formula1Driver formula1Driver : driverArray) {
                mainTable.insertRow(0, new Object[]{formula1Driver.getDriverName(), formula1Driver.getTeamName(), formula1Driver.getLocation(),
                        formula1Driver.getFirst_positions(),formula1Driver.getSecond_positions(),formula1Driver.getThird_positions(),formula1Driver.getTotal_points()});

        }

            JButton asc=new JButton("Close");
            asc.setBounds(320,350,250,50);
            asc.setFont(new Font("Arial", Font.BOLD, 20));

            asc.setBackground(Color.white);
            asc.setForeground(Color.BLACK);

            asc.setBorder(new RoundBtn(15));

            f1Gui.add(asc);

            asc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f1Gui.dispose();

                }
            });

            f1Gui.add(new JScrollPane(jTbl));


            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            f1Gui.setSize(900,500);



            f1Gui.setLocationRelativeTo(null);



        JScrollPane guiPane = new JScrollPane(jTbl);
            f1Gui.add(guiPane);


            f1Gui.setVisible(true);
    }
    public void randomMethod(){
        Formula1ChampionshipManager formula1ChampionshipManager=new Formula1ChampionshipManager();
        JFrame randomFrame = new JFrame("Add Random Race");


        JLabel random=new JLabel(" ");


        JButton rndBtn=new JButton("Add Random Race");
        rndBtn.setBounds(320,200,250,50);
        rndBtn.setFont(new Font("Arial", Font.BOLD, 20));

        rndBtn.setBackground(Color.black);
        rndBtn.setForeground(Color.white);

        rndBtn.setBorder(new RoundBtn(15));


        JButton asc=new JButton("Close");
        asc.setBounds(320,300,250,50);
        asc.setFont(new Font("Arial", Font.BOLD, 20));

        asc.setBackground(Color.BLACK);
        asc.setForeground(Color.white);

        asc.setBorder(new RoundBtn(15));

        randomFrame.add(asc);
        asc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomFrame.dispose();

            }
        });

        randomFrame.add(rndBtn);
        randomFrame.add(random);


        randomFrame.setVisible(true);
        rndBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formula1ChampionshipManager.randomRaceData();
            }

        });

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        randomFrame.setSize(900,500);


        randomFrame.setLocationRelativeTo(null);

    }
    public void searchDriver() {

        JFrame frame = new JFrame(" Search Details");


        DefaultTableModel mainTable = new DefaultTableModel();
        JTable table = new JTable(mainTable);

        frame.setLocationRelativeTo(null);

        table.setRowHeight(27);
        table.setBackground(Color.darkGray);
        table.setForeground(Color.white);

        table.setFont(new Font("Arial", Font.PLAIN, 18));



        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setBackground(Color.black);
        tableHeader.setForeground(Color.white);
        tableHeader.setSize(0,29);
        Font headerFont = new Font("Verdana", Font.PLAIN, 17);
        tableHeader.setFont(headerFont);

        mainTable.addColumn("Driver Name");
        mainTable.addColumn("Team Name");
        mainTable.addColumn("Location");
        mainTable.addColumn("Race Date");
        mainTable.addColumn("1st positions");
        mainTable.addColumn("2nd positions");
        mainTable.addColumn("3rd positions");
        mainTable.addColumn("Total Points");

        driverArray.sort(new DscSorter());

        for (Formula1Driver formula1Driver : driverArray) {
            mainTable.insertRow(0, new Object[]{formula1Driver.getDriverName(), formula1Driver.getTeamName(), formula1Driver.getLocation(),formula1Driver.getdRace(),
                    formula1Driver.getFirst_positions(),formula1Driver.getSecond_positions(),formula1Driver.getThird_positions(),formula1Driver.getTotal_points()});

        }


        final JTable table1 = new JTable(mainTable);
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(mainTable);
        table.setRowSorter(sorter);
        JScrollPane pane = new JScrollPane(table);
        frame.add(pane, BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        JLabel upLa = new JLabel("  Name  ");
        upLa.setFont(new Font("Arial", Font.PLAIN, 20));
        upLa.setBounds(0,0,130,25);
        panel.add(upLa, BorderLayout.WEST);
        final JTextField filName = new JTextField("Enter name here");
        filName.setFont(new Font("Arial", Font.PLAIN, 20));
        filName.setBounds(0,0,130,25);
        filName.setForeground(Color.GRAY);
        panel.add(filName, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.NORTH);
        JButton filterButton = new JButton("Start Filter");
        filterButton.setBounds(320,300,250,50);
        filterButton.setFont(new Font("Arial", Font.BOLD, 20));

        filterButton.setBackground(Color.LIGHT_GRAY);
        filterButton.setForeground(Color.BLACK);

        filterButton.setBorder(new RoundBtn(15));

        //references put on the bottom of this class



        filterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = filName.getText();
                if (text.length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter(text));
                }
            }
        });

        frame.add(filterButton, BorderLayout.SOUTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void raceProb(){

        JFrame probFrame = new JFrame("View Wining Probability");

        Formula1ChampionshipManager racePro=new Formula1ChampionshipManager();
        racePro.probSubMethod();

        DefaultTableModel mainTable = new DefaultTableModel();
        JTable jTbl = new JTable(mainTable);

        jTbl.setRowHeight(27);
        jTbl.setBackground(Color.darkGray);
        jTbl.setForeground(Color.white);

        jTbl.setFont(new Font("Arial", Font.PLAIN, 18));



        JTableHeader tableHeader = jTbl.getTableHeader();
        tableHeader.setBackground(Color.black);
        tableHeader.setForeground(Color.white);
        tableHeader.setSize(0,29);
        Font headerFont = new Font("Verdana", Font.PLAIN, 17);
        tableHeader.setFont(headerFont);


        mainTable.addColumn("Driver Name");
        mainTable.addColumn("Team Name");
        mainTable.addColumn("Location");
        mainTable.addColumn("start position");
        mainTable.addColumn("win prob");
        mainTable.addColumn("Total Points");

        for (Formula1Driver formula1Driver : driverArray) {
            mainTable.insertRow(0, new Object[]{formula1Driver.getDriverName(), formula1Driver.getTeamName(), formula1Driver.getLocation(),
                    formula1Driver.getProbF_position(),formula1Driver.getWinningProb(),formula1Driver.getTotal_points()});

        }
        JButton asc=new JButton("Close");
        asc.setBounds(320,350,250,50);
        asc.setFont(new Font("Arial", Font.BOLD, 20));

        asc.setBackground(Color.white);
        asc.setForeground(Color.BLACK);

        asc.setBorder(new RoundBtn(15));

        probFrame.add(asc);

        asc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                probFrame.dispose();


            }
        });

        probFrame.add(jTbl);
        probFrame.add(new JScrollPane(jTbl));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        probFrame.setSize(900, 500);
        probFrame.setLocationRelativeTo(null);
        probFrame.setVisible(true);
    }
    class RoundBtn implements Border        //border round
    {
        private int r;
        RoundBtn(int r) {
            this.r = r;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.r+1, this.r+1, this.r+2, this.r);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y,
                                int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, r, r);
        }
    }
    /* REFERENCE
    * https://stackhowto.com/how-to-create-rounded-jbutton-in-java/ */

    public void dateRace(){

        JFrame dateFrame = new JFrame("View Race Date");

        Formula1ChampionshipManager racePro=new Formula1ChampionshipManager();
        racePro.probSubMethod();

        DefaultTableModel mainTable = new DefaultTableModel();
        JTable jTbl = new JTable(mainTable);

        jTbl.setRowHeight(27);
        jTbl.setBackground(Color.darkGray);
        jTbl.setForeground(Color.white);

        jTbl.setFont(new Font("Arial", Font.PLAIN, 18));



        JTableHeader tableHeader = jTbl.getTableHeader();
        tableHeader.setBackground(Color.black);
        tableHeader.setForeground(Color.white);
        tableHeader.setSize(0,29);
        Font headerFont = new Font("Verdana", Font.PLAIN, 17);
        tableHeader.setFont(headerFont);


        mainTable.addColumn("Driver Name");
        mainTable.addColumn("Team Name");
        mainTable.addColumn("Location");
        mainTable.addColumn("Race Date");
        mainTable.addColumn("start position");
        mainTable.addColumn("win prob");
        mainTable.addColumn("Total Points");

        for (Formula1Driver formula1Driver : driverArray) {
            mainTable.insertRow(0, new Object[]{formula1Driver.getDriverName(), formula1Driver.getTeamName(), formula1Driver.getLocation(),formula1Driver.getdRace(),
                    formula1Driver.getProbF_position(),formula1Driver.getWinningProb(),formula1Driver.getTotal_points()});

        }
        JButton asc=new JButton("Close");
        asc.setBounds(320,350,250,50);
        asc.setFont(new Font("Arial", Font.BOLD, 20));

        asc.setBackground(Color.white);
        asc.setForeground(Color.BLACK);

        asc.setBorder(new RoundBtn(15));

        dateFrame.add(asc);

        asc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dateFrame.dispose();


            }
        });

        dateFrame.add(jTbl);
        dateFrame.add(new JScrollPane(jTbl));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        dateFrame.setSize(1000, 500);
        dateFrame.setLocationRelativeTo(null);
        dateFrame.setVisible(true);
    }

}

//https://www.tutorialspoint.com/how-to-create-defaulttablemodel-which-is-an-implementation-of-tablemodel
//https://stackoverflow.com/questions/22066387/how-to-search-an-element-in-a-jtable-java