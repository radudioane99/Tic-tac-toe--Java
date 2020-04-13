package Xand0;

import Lab09_ex02.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerNamesWin extends JFrame {
    //Components
    Container c;
    JLabel Player1;
    JLabel Player2;
    JTextField txtpl1;
    JTextField txtpl2;
    JButton ok;


    //Constructor
    public PlayerNamesWin(String name) {
        super(name);
        init();
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init() {
        //Background and design
        this.setBounds(300, 200, 400, 400);
        this.setBackground(Color.GREEN);
        this.c = getContentPane();
        Color myBack = new Color(103, 24, 214);
        this.c.setBackground(myBack);
        this.c.setLayout(null);

        //Player 1 And Player 2 Labels//
        Player1 = new JLabel("Player 1 Name:");
        Player1.setBounds(20, 0, 120, 50);
        Player1.setForeground(Color.WHITE);
        Player1.setFont(new Font("Times", Font.BOLD, 16));

        Player2 = new JLabel("Player 2 Name:");
        Player2.setBounds(20, 120, 120, 50);
        Player2.setForeground(Color.WHITE);
        Player2.setFont(new Font("Times", Font.BOLD, 16));


        c.add(Player1);
        c.add(Player2);

        // JTextFields for writing the name
        Color myViolet = new Color(199, 174, 252);
        txtpl1 = new JTextField();
        txtpl1.setForeground(Color.RED);
        txtpl1.setFont(new Font("Times", Font.BOLD, 26));
        txtpl1.setBackground(myViolet);
        txtpl1.setBounds(0, 50, 300, 50);

        txtpl2 = new JTextField();
        txtpl2.setForeground(Color.RED);
        txtpl2.setFont(new Font("Times", Font.BOLD, 26));
        txtpl2.setBackground(myViolet);
        txtpl2.setBounds(0, 170, 300, 50);
        c.add(txtpl1);
        c.add(txtpl2);

        // Ok button
        ok = new JButton("OK");
        ok.setBounds(150, 300, 100, 40);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (txtpl1.getText().equals("") || txtpl2.getText().equals("")) {
                    JOptionPane.showMessageDialog(c, "Player 1 or Player 2 names are invalid! ", "Enter Both Names", JOptionPane.ERROR_MESSAGE);
                    // Message box -> error -> forget to write a name (player 1 or player2)
                    return;
                } else {
                    //Get the names and start the game
                    Xand0.Player1.p1name = txtpl1.getText();
                    Xand0.Player2.p2name = txtpl2.getText();
                    dispose();
                    MainWin Mw = new MainWin("X & 0");
                    Mw.setVisible(true);
                }

            }
        });
        c.add(ok);
    }

}

