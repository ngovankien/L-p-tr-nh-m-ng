/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author dacla
 */
public class T72UDPReceiver {
    public static void main(String[] args) {
        try {
            // Tao doi tuong lien  ket voi cong 12345
            DatagramSocket socket = new DatagramSocket(12345);
            // Tao mang du lieu nhan duoc
            byte[] buffer = new byte[1024];
            //doi tuong nhan du lieu
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length );
            // Thuc hien nhan
            socket.receive(packet);
            // doc du lieu goi va in ra man hinh
            String receiveData = new String(packet.getData(),0,packet.getLength());
            System.out.println("Du lieu nhan duoc: "+receiveData);
            //dong ket noi
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
