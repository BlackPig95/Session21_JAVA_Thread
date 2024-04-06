package baitap;

public class Bai6
{
    public static void main(String[] args)
    {
        Runnable lazyPrime = new LazyPrimeFactorization(10000);
        Runnable optimizedPrime = new OptimizedPrimeFactorization(10000);
        Thread threadLazy = new Thread(lazyPrime);
        Thread threadOptimized = new Thread(optimizedPrime);
        threadLazy.start();
        threadOptimized.start();
    }
}

class LazyPrimeFactorization implements Runnable
{
    private int max;

    public LazyPrimeFactorization(int max)
    {
        this.max = max;
    }

    @Override
    public void run()
    {
        for (int i = 2; i <= max; i++)
        {
            if (i == 2)
            {
                System.out.println("Lazy prime " + i);
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.println("Lazy prime " + i);
            }
        }
    }
}

class OptimizedPrimeFactorization implements Runnable
{
    private int max;

    public OptimizedPrimeFactorization(int max)
    {
        this.max = max;
    }

    @Override
    public void run()
    {
        for (int i = 2; i <= max; i++)
        {
            if (i == 2)
            {
                System.out.println("Optimized prime " + i);
                continue;
            }
            boolean isPrime = true;
            int n = (int) Math.sqrt(i);
            for (int j = 2; j < n; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.println("Optimized prime " + i);
            }
        }
    }
}
