package baitap;

public class Bai9 implements Runnable
{
    public static void main(String[] args)
    {
        Thread bai9 = new Thread(new Bai9());
        bai9.start();
    }

    @Override
    public void run()
    {
        for (int i = 10; i >= 1; i--)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("Waiting " + i + " s");
        }
        System.out.println("Finished");
    }
}
