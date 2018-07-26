
package com.project.steganography;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JLabel;
import sun.misc.*; 

public class Sender extends javax.swing.JFrame implements ActionListener{
  Thread t=new Thread();
    public Sender() {
        
        setTitle("Steganography");
        //setContentPane(new JLabel(new ImageIcon("C:\\Users\\Himanshu Chhabra\\Desktop\\Stegimage\\steg2.jpg")));
        initComponents();
         jButton2.addActionListener(this);
         jButton4.addActionListener(this);
         jButton5.addActionListener(this);
         jButton1.addActionListener(this);
         jButton3.addActionListener(this);

         //jButton1.addActionListener(this);
        /* try{
         sss1=new ServerSocket(6789);   
         ss=sss1.accept();
         infromuser =new BufferedReader(new InputStreamReader(System.in));
         infromclient =new BufferedReader(new InputStreamReader(ss.getInputStream()));
         outtoclient=new PrintStream(ss.getOutputStream());
       }
    catch(Exception e)
    {}*/
    }
      
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        label1 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        label1.setText("label1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter secret text");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Encrypt");

        jLabel4.setText("SELECT YOUR IMAGE");

        jButton1.setText("Embed");

        jButton3.setText("Done");

        jLabel5.setText("Enter the secret key");

        jButton4.setText("Ok");

        jButton5.setText("Submit");

        jButton6.setText("Browse");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jMenu3.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Exit");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jButton5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton6))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addGap(152, 152, 152)
                                                .addComponent(jButton2)
                                                .addGap(11, 11, 11))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jButton3)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton5)))
                        .addGap(18, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jButton2))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton6))))
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static File file;
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        
         JFileChooser filechooser= new JFileChooser();
    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    //below codes for select  the file 
    int returnval=filechooser.showOpenDialog(this);
    if(returnval==JFileChooser.APPROVE_OPTION)
    {
         file = filechooser.getSelectedFile();
        //System.out.print(file);
        BufferedImage bi;
        try
        {   //display the image in jlabel
            bi=ImageIO.read(file);
            jLabel2.setIcon(new ImageIcon(bi));
        }
        catch(IOException e)
        {

        }
        this.pack();
    }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
         JFileChooser filechooser= new JFileChooser();
    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    //below codes for select  the file 
    int returnval=filechooser.showOpenDialog(this);
    if(returnval==JFileChooser.APPROVE_OPTION)
    {
         file = filechooser.getSelectedFile();
        //System.out.print(file);
        BufferedImage bi;
        try
        {   //display the image in jlabel
            bi=ImageIO.read(file);
            jLabel2.setIcon(new ImageIcon(bi));
        }
        catch(IOException e)
        {

        }
        this.pack();
    }
    }//GEN-LAST:event_jButton6ActionPerformed
     int a[]={1,2,3,4}; 
    //start3
    public static  void main(String arrgs[])throws IOException{
   /// public  void start3()throws Exception {
            /*sss1=new ServerSocket(5678);
             //Myframe1 f1=new Myframe1();
         ss=sss1.accept();
         infromuser =new BufferedReader(new InputStreamReader(System.in));
         infromclient =new BufferedReader(new InputStreamReader(ss.getInputStream()));
         outtoclient=new PrintStream(ss.getOutputStream());*/
        
        
        
         
                    
         
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sender().setVisible(true);
            }
        });
        
        
        
    }
       /*static ServerSocket ss1;
       static Socket s;
       static BufferedReader infromuser,infromclient;
       static PrintStream outtoclient;*/
  
     ServerSocket sss1;
        Socket ss;
        BufferedReader infromuser,infromclient;
        PrintStream outtoclient;

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
  
    
    String plaintext="",k="";
    static String input="";
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jButton3)
        {  
            getImage(pixels);
            System.exit(0);
          /*  try{
                //getImage(pixels);
            send();
           jLabel6.setText("Sent Successfully");
            }
            catch(Exception e)
            {}*/
        }
            
        if(ae.getSource()==jButton1)
        {
            try
            {
             embbed();   
             jLabel7.setText("Embedded Successfully");
            }
            catch(Exception e){}
        }
            
        if(ae.getSource()==jButton5)
        { 
            
            plaintext=jTextArea1.getText();     
        }
        if(ae.getSource()==jButton4)
        { 
            k=jTextField2.getText();  
            int i;
         int length=k.length();
         for(i=0;i<16;i++)
        {
         while(length!=0)
         {
            keyValue[i]=(byte)k.charAt(i);
            length--;
            i++;
         }
         keyValue[i]=0;
       }
         
        }
        
        if(ae.getSource()==jButton2)
        {   
            try{ 
            encrypt(plaintext,k);      
      
         
            }
            catch(Exception e)
            {
            }
        }
    
    }
         String algorithm = "AES";
         byte[] keyValue=new byte[16];
    public void encrypt(String plaintext,String k)throws Exception
    {
       
     
               Key key = generateKey();
                Cipher chiper = Cipher.getInstance(algorithm);
                chiper.init(Cipher.ENCRYPT_MODE, key);
                byte[] encVal = chiper.doFinal(plaintext.getBytes());
                String encryptedValue = new BASE64Encoder().encode(encVal);
                System.out.println("Encrypted Text : " + encryptedValue);
                conversion(encryptedValue);
                 
               //  decrypt(encryptedValue,k);
                   
                jProgressBar1.setValue(0);
      jProgressBar1.setStringPainted(true); 
             for(int i =0; i<= 100; i+=10)            
             jProgressBar1.setValue(i);
            jLabel3.setText("Message is Encrypted");
        // }});
     }
       
        public  void conversion(String cipher)
        {
            int num[]=new int[10000];
            String ip=" ";
            for(int i=0;i<cipher.length();i++)
            {
                num[i]=(int)cipher.charAt(i);
                ip=Integer.toBinaryString(num[i]);
                
                if(ip.length()<8)
                 {
                int no=8-ip.length();
                        while(no!=0)
                        {
                            ip="0"+ip;
                            no--;
                        }     
                  }
                  input+=ip;
                 ip=" ";
            }
            
            System.out.println(input+" "+input.length());
            System.out.println();
        }
        
    /*public void decrypt(String encryptedValue,String k)throws Exception
    {
        
         Key key = generateKey();
                Cipher chiper = Cipher.getInstance(algorithm);
                chiper.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedValue);
                byte[] decValue = chiper.doFinal(decordedValue);
                String decryptedValue = new String(decValue);   
             System.out.println("Decrypted Text : " + decryptedValue);
        
    }*/
    
    Key generateKey() throws Exception 
        {
                Key key = new SecretKeySpec(keyValue, algorithm);
                return key;
        }
    
    
 public static SampleModel sampleModel;
 static int count[]=new int[256];
 static int pixels[][];
 static int w,h;
   public static void embbed() throws IOException {
       
       BufferedImage img=ImageIO.read(file);
     // BufferedImage hugeImage = ImageIO.read(PerformanceTest.class.getResource("C:\\\\Users\\\\Himanshu Chhabra\\\\Desktop\\\\backup\\\\IMAG0127.jpg"));
          
    Raster raster=img.getData();
     w=raster.getWidth();
     h=raster.getHeight();
     pixels=new int[w][h];
    //SampleModel sampleModel;
System.out.println(w+" "+h);
    for (int x=0;x<w;x++)
    {
        for(int y=0;y<h;y++)
        {
            pixels[x][y]=raster.getSample(x,y,0);

           count[pixels[x][y]]++;
                //------------------------------here---------------
            //System.out.print(pixels[x][y]+" ");
        }
        //System.out.println();
    }
        sampleModel = raster.getSampleModel();
        maxMin(count);  
        
          
   }
   
  /* public static java.awt.Image getImage(int pixels[][])
{
     int w=pixels.length;
     int h=pixels[0].length;
     BufferedImage image=new BufferedImage(w,h,BufferedImage.TYPE_BYTE_GRAY);
WritableRaster raster= Raster.createWritableRaster(new PixelInterleavedSampleModel(0, w, h, 1, 1920, new int[] {0}), new Point(0,0));
    for(int i=0;i<w;i++)
    {
        for(int j=0;j<h;j++)
        {
            raster.setSample(i,j,0,pixels[i][j]);
        }
    }
    
    
    image.setData(raster);
   

File output=new File("abc.jpg");
try {
    ImageIO.write(image,"jpg",output);
}
catch (Exception e)
{
    e.printStackTrace();
}
return image;
}
*/   
   
 public static void maxMin(int count[])
 {
      
     int max=0,maxIndex=0;
     int min=32768,minIndex=0;
     //String input="1100101011000110101010100010110101010010101001010000010101010010101010100101010010101010010101111111111111010101101011111011010100011101001111";
     int length=input.length();
     for(int i=0;i<count.length;i++)
     {
        //System.out.print(count[i]+" ");
         if(count[i]>max)
         {
             max=count[i];
             maxIndex=i;
         }
         if(count[i]<min)
         {
             min=count[i];
             minIndex=i;
         }
             
     }
     System.out.println(maxIndex+" and number of pixels: "+count[maxIndex] );
     System.out.println(minIndex+" and number of pixels: "+count[minIndex] );
     int abc=0;
     if(maxIndex<minIndex)
     {
        for (int x=0;x<w;x++)
       {
        for(int y=0;y<h;y++)
        {
            if(pixels[x][y]>maxIndex&&pixels[x][y]<minIndex)
            {
                pixels[x][y]=pixels[x][y]+1;
            }
            
        }
       } 
     }
        
     else
     {
         abc=1;
         for (int x=0;x<w;x++)
        {
        for(int y=0;y<h;y++)
        {
            if(pixels[x][y]<maxIndex&&pixels[x][y]>minIndex)
            {
                pixels[x][y]=pixels[x][y]-1;
            }
            
        }
       }   
         
     }
     //embed
       int i=0;
       if(abc==0)
         for (int x=0;x<w;x++)
        {
         for(int y=0;y<h;y++)
         {
            if(pixels[x][y]==maxIndex&&length!=0)
            {
                length--;
                if(input.charAt(i)=='1')
                {
                   pixels[x][y]=pixels[x][y]+1;
                }
             i++;   
            }
            if(length==0)
                break;
         }
        }
       else
       {
         
           for (int x=0;x<w;x++)
        {
         for(int y=0;y<h;y++)
         {
            if(pixels[x][y]==maxIndex&&length!=0)
            {
                length--;
                if(input.charAt(i)=='1')
                {
                   pixels[x][y]=pixels[x][y]-1;
                }
             i++;   
            }
            if(length==0)
                break;
         }
        }
       }
         //deembed
         /*String output=" ";
         for (int x=0;x<w;x++)
         {
             for(int y=0;y<h;y++)
             {
                 if(pixels[x][y]==maxIndex)
                     output+="0";
                 if(pixels[x][y]==maxIndex+1)
                 {
                     output+="1";
                     pixels[x][y]--;
                 }
                     
             }
         }
         System.out.println(output);*/
         pixels[w-1][h-1]=maxIndex;//pixel insertion
         pixels[w-2][h-2]=minIndex;
         System.out.println(pixels[w-1][h-1]);
         
         
       
 }
 public static java.awt.Image getImage(int pixels[][])
{
     int w=pixels.length;
     int h=pixels[0].length;
     BufferedImage image=new BufferedImage(w+1,h+1,BufferedImage.TYPE_INT_RGB);
WritableRaster raster= Raster.createWritableRaster(new PixelInterleavedSampleModel(0, w, h, 1, 1920, new int[] {0}), new Point(0,0));
    for(int i=0;i<w;i++)
    {
        for(int j=0;j<h;j++)
        {
            raster.setSample(i,j,0,pixels[i][j]);
        }
    }
    
    
    image.setData(raster);
   

File output=new File("temp.png");
try {
    ImageIO.write(image,"png",output);
}
catch (Exception e)
{
    e.printStackTrace();
}
return image;
}

 public void send()throws IOException
 {
     
     //Myframe1 f1=new Myframe1();
       outtoclient.println(w);
       System.out.println("in");
       outtoclient.println(h);
         for (int x=0;x<w;x++)
         {
             for(int y=0;y<h;y++)
             {
                 outtoclient.println(pixels[x][y]);
             }            
         }
 }

}
    
    

    

