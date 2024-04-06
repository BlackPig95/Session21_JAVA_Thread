package baitap;

public class Bai1 implements Runnable
{
    public static void main(String[] args)
    {
        Thread bai1 = new Thread(new Bai1());
        bai1.start();
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("Waited " + i + " s");
        }
        System.out.println("Finished");
    }
}
