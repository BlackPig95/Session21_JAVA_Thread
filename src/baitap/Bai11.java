package baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai11 implements Runnable
{
    public static void main(String[] args)
    {
        Thread primeThread = new Thread(new Bai11());
        primeThread.start();
    }

    @Override
    public void run()
    {
        List<Integer> primeList = new ArrayList<>();
        primeList.add(2);
        int currentNum = 3;
        while (currentNum < 10000)
        {
            boolean isPrime = true;
            for (int i = 0; i < primeList.size(); i++)
            {
                if (currentNum % primeList.get(i) == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                primeList.add(currentNum);
            }
            currentNum += 2;
        }
        primeList.forEach(System.out::println);
    }
}
