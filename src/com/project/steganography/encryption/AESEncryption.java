package com.project.steganography.encryption;
import java.security.Key;
import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.*; 
class AES 
{
     String k;
     int i;
     Scanner s=new Scanner(System.in);
     private static String algorithm = "AES";
private static byte[] keyValue=new byte[16];
//{ '1' ,'5', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' };
     AES()throws Exception
     {
     System.out.println("Enter the key");
     k=s.nextLine();
         
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
  
        // Performs Encryption
        public static String encrypt(String plainText) throws Exception 
        {
                Key key = generateKey();
                Cipher chiper = Cipher.getInstance(algorithm);
                chiper.init(Cipher.ENCRYPT_MODE, key);
                byte[] encVal = chiper.doFinal(plainText.getBytes());
                String encryptedValue = new BASE64Encoder().encode(encVal);
                return encryptedValue;
        }

        // Performs decryption
        public static String decrypt(String encryptedText) throws Exception 
        {
                // generate key 
                Key key = generateKey();
                Cipher chiper = Cipher.getInstance(algorithm);
                chiper.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedText);
                byte[] decValue = chiper.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                return decryptedValue;
        }

//generateKey() is used for key expansion
        private static Key generateKey() throws Exception 
        {
                Key key = new SecretKeySpec(keyValue, algorithm);
                return key;
        }

        // performs encryption & decryption 
        public static void main(String args[]) throws Exception 
        {
             Scanner s=new Scanner(System.in);      
                 AES a=new AES();            
                String plainText;
                System.out.println("Enter the secret message:");
                plainText=s.nextLine();
                String encryptedText = AES.encrypt(plainText);
                String decryptedText = AES.decrypt(encryptedText);

                System.out.println("Plain Text : " + plainText);
                System.out.println("Encrypted Text : " + encryptedText);
                System.out.println("Decrypted Text : " + decryptedText);
                conversion(encryptedText);
        }
        
        public static void conversion(String cipher)
        {
            int num[]=new int[10000];
            String binary="";
            for(int i=0;i<cipher.length();i++)
            {
                num[i]=(int)cipher.charAt(i);
                binary+=Integer.toBinaryString(num[i]);
            }
            System.out.println(binary+" "+binary.length());
        }
}

