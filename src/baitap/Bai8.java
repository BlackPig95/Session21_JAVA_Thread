package baitap;

public class Bai8
{
    static int num = 100;

    public static void main(String[] args)
    {
        IncrementThread thread1 = new IncrementThread();
        DecrementThread thread2 = new DecrementThread();
        thread1.start();
        thread2.start();
    }

    void increment()
    {
        for (int i = 0; i < 100; i++)
        {
            num++;
            System.out.println(num);
        }
    }

    void decrement()
    {
        for (int i = 0; i < 100; i++)
        {
            num--;
            System.out.println(num);
        }
    }
}

class IncrementThread extends Thread
{
    Bai8 bai8;

    @Override
    public void run()
    {
        bai8 = new Bai8();
        bai8.increment();
    }
}

class DecrementThread extends Thread
{
    Bai8 bai8;

    @Override
    public void run()
    {
        bai8 = new Bai8();
        bai8.decrement();
    }
}
