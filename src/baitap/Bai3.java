package baitap;

public class Bai3
{
    public static void main(String[] args)
    {
        Runnable odd = new OddThreadBai3();
        Runnable even = new EvenThreadBai3();
        Thread threadOdd = new Thread(odd);
        Thread threadEven = new Thread(even);
        threadOdd.start();
        threadEven.start();
    }
}

class OddThreadBai3 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}

class EvenThreadBai3 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
