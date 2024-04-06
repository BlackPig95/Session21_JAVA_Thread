package baitap;

public class Bai7 extends Thread
{
    public static void main(String[] args)
    {
        Bai7 bai7 = new Bai7();
        bai7.start();
    }

    @Override
    public void run()
    {
        System.out.println((int) (Math.random() * (100 - 10) + 10));
    }
}
