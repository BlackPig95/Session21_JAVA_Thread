package baitap;

public class Bai5
{
    public static void main(String[] args)
    {
        Thread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        try
        {
            oddThread.join();
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        evenThread.start();
    }
}

class OddThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println("Odd " + i);
            }
            try
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}

class EvenThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Even " + i);
            }
            try
            {
                Thread.sleep(15);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
