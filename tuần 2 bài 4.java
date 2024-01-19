package javaapplication1.tuan2;
public class TinhTong {
    public static void main(String[] args) {
        // Mang cac so nguyen
        int[] array={1,2,3,4,5,6,7,8,9,10};
        //So luong thread 
        int numThreads = 2;
        //Mang cac luong
        Thread[] ths = new Thread[numThreads]; // Tao cac luong
        // Tao 2 doi tuong cho luong
        LopTinhTong[] cal = new LopTinhTong[numThreads];
        for(int i=0;i<numThreads;i++)
        {
            cal[i] = new LopTinhTong(array, i, numThreads); // Gan doi tuong cho luong
            ths[i] = new Thread(cal[i]);
            ths[i].start();// Bat dau luong
        }
        //doi cho cac luong hoan thanh
        for(int i=0;i<numThreads;i++)
        {
            try {
                ths[i].join(); // cho cho luong ket thuc
            } catch (Exception e) {
            }
        }
        // cong don
        int tong = 0;
        for(LopTinhTong c: cal)
        {
            tong += c.getTongTungPhan();
        }
        //In ket qua ra man  hinh
        System.out.println("Tong la "+tong);
    }
}

class LopTinhTong implements Runnable{
    
    private int[] array;
    private int startIndex;
    private int buocNhay;
    private int tongTungPhan;
    //insert code , constructer , 3 cai dau de ra code
    public LopTinhTong(int[] array, int startIndex, int buocNhay) {
        this.array = array;
        this.startIndex = startIndex;
        this.buocNhay = buocNhay;
        this. tongTungPhan = 0 ; // Chua dem
    }     
    @Override
    public void run() {
        for(int i=startIndex;i<array.length;i+=buocNhay)
        {
            tongTungPhan += array[i]; //Tinh tong tung phan
        }
        //insert code , getter , tongTungPhan de ra code
    }

    public int getTongTungPhan() {
        return tongTungPhan;
    }
    
}