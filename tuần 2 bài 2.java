package javaapplication1.tuan2;

public class DaLuong {
    
    
    
    public static void main(String[] args) {
        // Tao va goi luong 1
        Thread t1 = new Thread(new MyRunable("Luong 1"));
        t1.start();
        //Tao va goi luong 2
        Thread t2 = new Thread(new MyRunable("Luong 2"));
        t2.start();
    }
      
}
// Dinh nghia cac luong
class MyRunable implements Runnable{
    private String threadName; // ten cua thread
    public MyRunable(String name) // Ham khoi tao
    {
        this.threadName = name;
    }
    // Ham run se thuc hien khi ham start duoc goi
    @Override
    public void run() {
        System.out.println("Bat dau thuc hien cong viec trong "
        + threadName);
        // thuc Hien cong viec 
        
        for(int i=0;i<=5;i++)
        {
            System.out.println(threadName+" buoc "+i);
            try {
                Thread.sleep(2000); // ngu 2 giay
            } catch (Exception e) {
            }
                
        }
        System.out.println("Bat dau thuc hien cong viec trong "
        +threadName);
    }

}