
package baitaptuan7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class T71UDPSender {
    public static void main(String[] args) {
        try {
            // Tao object datagramssocket
            DatagramSocket socket = new DatagramSocket();
            // Du lieu can gui
            byte[] data ="Xin chao cac ban".getBytes();
            //xac dinh dia chi IP va cong cua may nhan
            InetAddress address = InetAddress.getByName("localhost");
            int port = 12345;
            //Tao goi du lieu
            DatagramPacket packet = new
                DatagramPacket(data, data.length,address,port);
               // Gui
               socket.send(packet);
               //Dong
               socket.close();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
