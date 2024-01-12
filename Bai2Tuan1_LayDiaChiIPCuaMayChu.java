/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapplication;

/**
 *
 * @author Long
 */
import java.net.InetAddress;

public class Bai2Tuan1 {
    public static void main(String[] args) {
        try {
            // In địa chỉ IP
            // Lấy địa chỉ IP của www.google.com
            InetAddress inet = InetAddress.getByName("www.google.com");
            // In địa chỉ IP
            System.err.println("Dia chi IP cua Google la : " + inet.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
