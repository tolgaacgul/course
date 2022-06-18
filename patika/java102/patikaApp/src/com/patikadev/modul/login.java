package com.patikadev.modul;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame{
    private JButton button1;
    private JPanel wrapper;

    public login() {

        setContentPane(wrapper);
        setSize(400,600);
        setTitle("Patika APP");

        // "setDefaultCloseOperation" -> kapatma buton bas uygulamayı durdur.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // boyutlanabilirlik
        setResizable(false);
        setVisible(true);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Example example = new Example();
            }
        });
    }
}
