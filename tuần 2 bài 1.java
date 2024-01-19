package javaapplication1.tuan2;

public class MyThread extends Thread {
    // cong viec ma luong can thuc hien trong phan run
    @Override
    public void run() {
        System.out.println("Luong bat dau chay");
    }
    
    public static void main(String[] args) {
        // tao luong
        MyThread myThread = new MyThread();
        // bat dau luong
        myThread.start();
        
        
    }
    
    
    
}
