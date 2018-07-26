package com.project.steganography.diffiehellman;

 import java.io.*;
import java.net.*;
public class SideA {
   static int X,Y;
    public static void main(String args[])throws Exception 
    {    int n,g,a;
        ServerSocket ss1=new ServerSocket(1234);
        Socket s=ss1.accept();
        BufferedReader infromuser =new BufferedReader(new InputStreamReader(System.in));
        BufferedReader infromclient =new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream outtoclient=new PrintStream(s.getOutputStream());
        String str;
        System.out.println("Enter the Prime Number");//frm user
        n=Integer.parseInt(infromuser.readLine());
        str=Integer.toString(n);
        outtoclient.println(str);
        str=infromclient.readLine();//frm sideB
        g=Integer.parseInt(str);
         System.out.println("Select a random number");//frm user
        a=Integer.parseInt(infromuser.readLine());
        compute(g,a,n);
        str=Integer.toString(X);//send to client
        outtoclient.println(str);
        
        str=infromclient.readLine();//frm sideB
        Y=Integer.parseInt(str);
        compute(Y,a,n);
        System.out.println("Key is:"+X);
        
    }
    public static void compute(int g,int a,int n)
    {
        X=(int)Math.pow(g,a)%n;
    }
}

    

