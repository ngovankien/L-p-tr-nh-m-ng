/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaptaun4;


import java.net.InetAddress;
import java.net.URL;
public class VD1 {
    public static void main(String[] args) {
        try {
            //c1 tạo đối tượng Inetadress bằng tên máy chủ
            InetAddress dcByName= InetAddress.getByName("www.google.com");
            //tạo đối tượng InetAdress bằng địa chỉ IP
            
            System.out.println("Lay dia chi tu name:"+dcByName.getHostAddress());
            //c2 tao đói tượng InetAdress bằng địa chỉ IP
            InetAddress dcByID=InetAddress.getByName("216.239.38.120");
            System.out.println("Lay dia chi tu IP:"+dcByID);
            
            
           // ------
           
            InetAddress dcByName1= InetAddress.getByName("www.vnexpress.net");  
            System.out.println("Hostname:"+dcByName1.getHostAddress());
            System.err.println("Dc IP:"+dcByName1.getHostAddress());
           // ------
            InetAddress dcByName2= InetAddress.getByName("www.vnexpress.net"); 
            //kiem tra xem dia chi IP co phai IP4 hay không?
            boolean isIP4=dcByName2 instanceof java.net.Inet4Address;
            System.out.println("co phai dia chi IP4 khong"+isIP4);
            //kiem tra xem co phai dia chi IP6 khong?
            boolean isIP6=dcByName2 instanceof java.net.Inet6Address;
            System.out.println("co phai dia chi IP6 khong"+isIP6);
            //----
            URL url=new URL("https://example.com/landing-page?utm_source=company-x&utm_medium=newsletter&utm_campaign=march_01&project-id=123");
            //phan tich thong tin tu URL
            System.out.println("Protocool:"+url.getProtocol());
            System.out.println("Host:"+url.getHost());
            System.out.println("Port"+url.getPort());
            System.out.println("Path"+url.getPath());
            System.out.println("ThamChieu"+url.getRef());
            System.out.println("Truy van"+url.getQuery());
        }catch(Exception e) {
            
        }
    }
}