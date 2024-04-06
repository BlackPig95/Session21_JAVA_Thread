package baitap;

import java.util.Scanner;

public class Bai10 implements Runnable
{
    public static void main(String[] args)
    {
        Bai10 bai10 = new Bai10();
        Thread thread = new Thread(bai10);
        thread.start();
    }

    @Override
    public void run()
    {
        waitForSec();
    }

    void waitForSec()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số s cần thread ngủ");
        int n = Integer.parseInt(scanner.nextLine());
        try
        {
            Thread.sleep(n * 1000L);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("Finished");
    }
}
