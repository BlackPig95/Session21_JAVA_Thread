package baitap;

public class Bai2 implements Runnable
{
    public static void main(String[] args)
    {
        Bai2 bai2 = new Bai2();
        Thread threadBai2 = new Thread(bai2);
        threadBai2.start();
    }

    @Override
    public void run()
    {
        int sum = 0;
        for (int i = 1; i <= 1000; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
