package com.project.steganography.authentication;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import com.project.steganography.Receiver;

import java.text.*;

class guiframe1 extends Frame implements ActionListener {

    Label l1, l2;
    TextField t1;
    Button b1;

    guiframe1() {
        setLayout(null);
        l1 = new Label("Enter password");
        l2 = new Label();
        t1 = new TextField(20);
        t1.setEchoChar('*');
        b1 = new Button("OK");

        l1.setBounds(75, 100, 100, 30);
        t1.setBounds(185, 100, 70, 30);
        b1.setBounds(265, 100, 40, 20);
        l2.setBounds(80, 135, 120, 30);

        add(l1);
        add(l2);
        add(t1);
        add(b1);
        b1.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String password;
        int flag = 0;
        String args[] = new String[5];

        if (ae.getSource() == b1) {
            password = t1.getText();
            DateFormat df = new SimpleDateFormat("HH:mm");
            Date d = new Date();
            String time = df.format(d);
            StringBuffer t1 = new StringBuffer(time);
            t1 = t1.deleteCharAt(2);
            time = t1.toString();
            if (password.equals(time)) {
                l2.setText("ACCESS GRANTED");
                try {
                    //Frame2 f2 = new Frame2();
                    Receiver j1=new Receiver();
                    setVisible(false);
                    j1.start9();

                } catch (Exception e) {
                }
            } else {
                l2.setText("ACCESS DENIED");
            }

        }
    }
}

public class PasswordReceiver {

    //public static void main(String args[]) throws Exception
    public void pass2()throws Exception
    {
        guiframe1 g = new guiframe1();
        g.setSize(400, 400);
        g.setTitle("Authentication B");
        g.setVisible(true);

        /*Scanner s =new Scanner(System.in);
         System.out.println("Enter the Password:");
         String str=s.nextLine();
         DateFormat df=new SimpleDateFormat("HH:mm");
         Date d=new Date();
         String time=df.format(d);
         StringBuffer t1=new StringBuffer(time);
         t1=t1.deleteCharAt(2);
         time=t1.toString();
         System.out.println(t1);
        
         if(str.equals(time))
         System.out.println("Access Granted");
         else
         System.out.println("Access Denied");*/
    }
}
