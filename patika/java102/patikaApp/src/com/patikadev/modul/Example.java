package com.patikadev.modul;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame{
    private JPanel wrapper;
    private JPanel jp_top;
    private JPanel jp_bottom;
    private JLabel lbl_title;
    private JTextField txt_fld_userName;
    private JLabel lbl_userName;
    private JTextField txt_fld_password;
    private JLabel lbl_password;
    private JButton btn_login;

    public Example(){
        // yüklü temalar(LookAndFeels)
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            System.out.println(info.getName() + " -> " + info.getClassName());
        }
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if(info.getName().equals("CDE/Motif")){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("## " + info.getName() + " adlı UI var.");
            }
        }

        // add(wrapper);
        // Aynı işlev
        setContentPane(wrapper);
        setSize(400,600);
        setTitle("Patika APP");

        // "setDefaultCloseOperation" -> kapatma buton bas uygulamayı durdur.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // boyutlanabilirlik
        setResizable(false);

        // "setLocationRelativeTo" -> pencereyi ortala otomatik
        // setLocationRelativeTo(null);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x,y);

        // pencereyi görünür yap
        setVisible(true);

        // buton tıklandığında
        btn_login.addActionListener(e -> {
            if(txt_fld_userName.getText().length() == 0 || txt_fld_password.getText().length() == 0){
                JOptionPane.showMessageDialog(null, "Boş alan olamaz!", "Uyarı", JOptionPane.WARNING_MESSAGE);
            }
        });
    }


}
