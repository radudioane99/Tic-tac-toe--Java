package Xand0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWin extends JFrame {
     //Components
       Container c;
       JButton p11;
       JButton p12;
       JButton p13;
       JButton p21;
       JButton p22;
       JButton p23;
       JButton p31;
       JButton p32;
       JButton p33;
       JButton iconX;
       JButton icon0;
       JTextField play1;
       JTextField play2;
       JLabel labelPlayer1;
       JLabel labelPlayer2;
    //Turn -> very important in order to determine which player turn is
       static int turn=0;

     public MainWin(String Name){
         super(Name);
         initComponents();
         this.setVisible(true);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }

     public void initComponents(){
         // Background//
         this.setBounds(50, 50, 800, 600);
         this.setBackground(Color.GREEN);
         this.c = getContentPane();
         Color myBack2 = new Color(141, 90, 199);
         this.c.setBackground(myBack2);
         this.c.setLayout(null);

         // The game + players
         Player1 p1 =new Player1();
         Player2 p2 =new Player2();


         p11 = new JButton("");
         p11.setBounds(100,200,90,90);
         p11.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 p11.setFont( new Font("Times", Font.BOLD, 36));
                 if(MainWin.turn%2==0) p1.setX(p11); //Player 1 turn
                 if(MainWin.turn%2!=0) p2.set0(p11); //Player 2 turn
                 turn++; // switch turn
                 p11.setEnabled(false);
                 check();
             }
         });
         c.add(p11);

         p12 = new JButton("");
         p12.setBounds(190,200,90,90);
         p12.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 p12.setFont( new Font("Times", Font.BOLD, 36));
                 if(MainWin.turn%2==0) p1.setX(p12); //Player 1 turn
                 if(MainWin.turn%2!=0) p2.set0(p12); //Player 2 turn
                 turn++; // switch turn
                 p12.setEnabled(false);
                 check();
             }
         });
         c.add(p12);

         p13 = new JButton("");
         p13.setBounds(280,200,90,90);
         p13.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 p13.setFont( new Font("Times", Font.BOLD, 36));
                 if(MainWin.turn%2==0) p1.setX(p13); //Player 1 turn
                 if(MainWin.turn%2!=0) p2.set0(p13); //Player 2 turn
                 turn++; // switch turn
                 p13.setEnabled(false);
                 check();
             }
         });
         c.add(p13);

         p21 = new JButton("");
         p21.setBounds(100,290,90,90);
         p21.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 p21.setFont( new Font("Times", Font.BOLD, 36));
                 if(MainWin.turn%2==0) p1.setX(p21); //Player 1 turn
                 if(MainWin.turn%2!=0) p2.set0(p21); //Player 2 turn
                 turn++; // switch turn
                 p21.setEnabled(false);
                 check();
             }
         });
         c.add(p21);

         p22 = new JButton("");
         p22.setBounds(190,290,90,90);
         p22.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 p22.setFont( new Font("Times", Font.BOLD, 36));
                 if(MainWin.turn%2==0) p1.setX(p22); //Player 1 turn
                 if(MainWin.turn%2!=0) p2.set0(p22); //Player 2 turn
                 turn++; // switch turn
                 p22.setEnabled(false);
                 check();
             }
         });
         c.add(p22);

         p23 = new JButton("");
         p23.setBounds(280,290,90,90);
         p23.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 p23.setFont( new Font("Times", Font.BOLD, 36));
                 if(MainWin.turn%2==0) p1.setX(p23); //Player 1 turn
                 if(MainWin.turn%2!=0) p2.set0(p23); //Player 2 turn
                 turn++; // switch turn
                 p23.setEnabled(false);
                 check();
             }
         });
         c.add(p23);

         p31 = new JButton("");
         p31.setBounds(100,380,90,90);
         p31.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 p31.setFont( new Font("Times", Font.BOLD, 36));
                 if(MainWin.turn%2==0) p1.setX(p31); //Player 1 turn
                 if(MainWin.turn%2!=0) p2.set0(p31); //Player 2 turn
                 turn++; // switch turn
                 p31.setEnabled(false);
                 check();
             }
         });
         c.add(p31);

         p32 = new JButton("");
         p32.setBounds(190,380,90,90);
         p32.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 p32.setFont( new Font("Times", Font.BOLD, 36));
                 if(MainWin.turn%2==0) p1.setX(p32); //Player 1 turn
                 if(MainWin.turn%2!=0) p2.set0(p32); //Player 2 turn
                 turn++; // switch turn
                 p32.setEnabled(false);
                 check();
             }
         });
         c.add(p32);

         p33 = new JButton("");
         p33.setBounds(280,380,90,90);
         p33.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 p33.setFont( new Font("Times", Font.BOLD, 36));
                 if(MainWin.turn%2==0) p1.setX(p33); //Player 1 turn
                 if(MainWin.turn%2!=0) p2.set0(p33);
                 turn++;
                 p33.setEnabled(false);
                 check();
             }
         });
         c.add(p33);


         //The player names + design

         Color myViolet = new Color(199, 174, 252);


         labelPlayer1 = new JLabel("Player 1:");
         labelPlayer1.setBounds(25, 10, 120, 50);
         labelPlayer1.setForeground(Color.WHITE);
         labelPlayer1.setFont(new Font("Times", Font.BOLD, 20));
         c.add(labelPlayer1);

         play1 = new JTextField();
         play1.setForeground(Color.BLACK);
         play1.setBackground(myViolet);
         play1.setFont(new Font("Times", Font.BOLD, 26) );
         play1.setBounds(10, 60, 300, 50);
         play1.setText(Player1.p1name);
         play1.setEditable(false); // not change the given name
         c.add(play1);


         iconX = new JButton("X");
         iconX.setFont(new Font("Times", Font.BOLD, 30));
         iconX.setBounds(115,10,50,50);
         c.add(iconX);




         labelPlayer2 = new JLabel("Player 2:");
         labelPlayer2.setBounds(345, 10, 120, 50);
         labelPlayer2.setForeground(Color.WHITE);
         labelPlayer2.setFont(new Font("Times", Font.BOLD, 20));
         c.add(labelPlayer2);

         play2 = new JTextField();
         play2.setForeground(Color.BLACK);
         play2.setBackground(myViolet);
         play2.setFont(new Font("Times", Font.BOLD, 26) );
         play2.setBounds(330, 60, 300, 50);
         play2.setText(Player2.p2name);
         play2.setEditable(false); // not change the given name
         c.add(play2);


         icon0 = new JButton("0");
         icon0.setFont(new Font("Times", Font.BOLD, 30));
         icon0.setBounds(435,10,50,50);
         c.add(icon0);



     }

    public void check(){

                                                            ///LINES//

        if (p11.getText().equals(p12.getText()) && p11.getText().equals(p13.getText())) {
            if (p11.getText().equals("X")) {
                JOptionPane.showMessageDialog(c, Player1.p1name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
            if (p11.getText().equals("0")) {
                JOptionPane.showMessageDialog(c, Player2.p2name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
        }

        if (p21.getText().equals(p22.getText()) && p21.getText().equals(p23.getText())) {
            if(p21.getText().equals("X")) {
                JOptionPane.showMessageDialog(c, Player1.p1name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
            if(p21.getText().equals("0")) {
                JOptionPane.showMessageDialog(c, Player2.p2name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
        }

        if (p31.getText().equals(p32.getText()) && p31.getText().equals(p33.getText())) {
            if(p31.getText().equals("X")) {
                JOptionPane.showMessageDialog(c, Player1.p1name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
            if(p31.getText().equals("0"))  {
                JOptionPane.showMessageDialog(c, Player2.p2name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }

        }

                                                            ///COLUMNS///

        if (p11.getText().equals(p21.getText()) && p11.getText().equals(p31.getText())) {
            if(p11.getText().equals("X")) {
                JOptionPane.showMessageDialog(c, Player1.p1name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
            if(p11.getText().equals("0")) {
                JOptionPane.showMessageDialog(c, Player2.p2name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
        }

        if (p12.getText().equals(p22.getText()) && p12.getText().equals(p32.getText())) {
            if(p12.getText().equals("X")) {
                JOptionPane.showMessageDialog(c, Player1.p1name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
            if(p12.getText().equals("0")) {
                JOptionPane.showMessageDialog(c, Player2.p2name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
        }

        if (p13.getText().equals(p23.getText()) && p13.getText().equals(p33.getText())) {
            if(p13.getText().equals("X")) {
                JOptionPane.showMessageDialog(c, Player1.p1name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
            if(p13.getText().equals("0")) {
                JOptionPane.showMessageDialog(c, Player2.p2name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
        }

                                                         //DIAGONALS///

        if (p11.getText().equals(p22.getText()) && p11.getText().equals(p33.getText())) {
            if(p11.getText().equals("X")) {
                JOptionPane.showMessageDialog(c, Player1.p1name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
            if(p11.getText().equals("0"))  {
                JOptionPane.showMessageDialog(c, Player2.p2name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
        }

        if (p31.getText().equals(p22.getText()) && p31.getText().equals(p13.getText())) {
            if(p31.getText().equals("X")) {
                JOptionPane.showMessageDialog(c, Player1.p1name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
            if(p31.getText().equals("0")) {
                JOptionPane.showMessageDialog(c, Player2.p2name + " has won!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                turn=0;//reset game
                new PlayerNamesWin("Player Register"); //open a new game
            }
        }

        if (turn==9) {
            JOptionPane.showMessageDialog(c, " Tie! Better luck next time!", "Tie game!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            turn=0;//reset game
            new PlayerNamesWin("Player Register"); //open a new game
        }


    }



}
