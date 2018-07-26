package com.project.steganography.diffiehellman;

import java.io.*;
import java.net.*;
public class SideB {
   static int X,Y;
    public static void main(String args[])throws Exception 
    {    int n,g,b;
        Socket s1=new Socket("localhost",1234);
        BufferedReader infromuser =new BufferedReader(new InputStreamReader(System.in));
        BufferedReader infromserver =new BufferedReader(new InputStreamReader(s1.getInputStream()));
        PrintStream outtoserver=new PrintStream(s1.getOutputStream());
        String str;
        System.out.println("Enter the Prime Number");//frm user
        g=Integer.parseInt(infromuser.readLine());
        str=Integer.toString(g);
        outtoserver.println(str);
        str=infromserver.readLine();//frm sideA
        n=Integer.parseInt(str);
         System.out.println("Select a random number");//frm user
        b=Integer.parseInt(infromuser.readLine());
        compute1(g,b,n);
        str=Integer.toString(Y);//send to sideA
        outtoserver.println(str);
       
        str=infromserver.readLine();//frm sideB
        X=Integer.parseInt(str);
        compute1(X,b,n);
        System.out.println("Key is:"+Y);
        
    }
    public static void compute1(int g,int a,int n)
    {
        Y=(int)Math.pow(g,a)%n;
    }
}

    

