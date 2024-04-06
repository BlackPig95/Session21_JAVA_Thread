package baitap;

public class MainBaiTap
{
    public static void main(String[] args)
    {
        Bai4_NumberGenerator ng1 = new Bai4_NumberGenerator("NG1");
        Bai4_NumberGenerator ng2 = new Bai4_NumberGenerator("NG2");

        Thread thread1 = new Thread(ng1);
        Thread thread2 = new Thread(ng2);

        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();

        Runnable ng3 = new Bai4_NumberGenerator("NG3");
        Runnable thread3 = new Thread(ng3);//Không phải class Thread, class Thread implement Runnable Interface
        thread3.run();//Chạy trong main thread vì không được add vào thread scheduler

        Bai4_NumberGenerator ng4 = new Bai4_NumberGenerator("NG4");
        ng4.run();//Tương tự khai báo bằng runnable
    }
}
