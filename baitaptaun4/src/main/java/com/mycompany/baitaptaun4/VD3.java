/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaptaun4;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class VD3 {
    public static void main(String[] args) {
    try{
        //tao doi tuong tu dia chi URL
        URL url=new URL("https://www.google.com");
        //moi ket noi dne url 
        URLConnection uRLConnection =url.openConnection();
        // doc du lieu tu ket noi
        BufferedReader reader=new BufferedReader(
        new InputStreamReader(uRLConnection.getInputStream()));
        //tao doi tuong ghi file
        FileWriter fileWriter=new FileWriter("a.html");
        //doc tung dong
        String line="";
        while((line=reader.readLine())!=null) {
        fileWriter.write(line+"\n");
        }
        //dong luong
        reader.close();
        fileWriter.close(); //dong file
    }catch(Exception e) {
        
    }
        
    }
    }