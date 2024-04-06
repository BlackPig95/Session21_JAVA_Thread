package baitap;

public class Bai4_NumberGenerator implements Runnable
{
    private String name;

    public Bai4_NumberGenerator(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(this.name + " " + i);
            System.out.println(this.hashCode());
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
