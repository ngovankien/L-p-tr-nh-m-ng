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

public class Bai1Tuan1 {
    public static void main(String[] args) {
        try {
            // Kiểm tra kết nối Internet
            // Lấy địa chỉ IP của www.google.com
            InetAddress inet = InetAddress.getByName("www.google.com");

            // Thử kết nối
            boolean isReachable = inet.isReachable(5000);

            // In thông báo
            if (isReachable) {
                System.out.println("Co ket noi Internet");
            } else {
                System.out.println("Khong co ket noi Internet");
            }
        } catch (Exception e) {
            
        }
    }
}
