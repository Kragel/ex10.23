package t_10_innerClasses.ex23;

public class B {

    private final int SIZE = 10;

    public U[] us = new U[SIZE];

    public void saveU(int number, U u)
    {
        us[number] = u;
    }

    public void deleteU(int number)
    {
        us[number] = null;
    }

    public void process()
    {
        int i = 0;
        for (U u : us)
        {
            if (u != null)
            {
                System.out.println("#" + ++i);
                u.firstMethod();
                u.secondMethod();
                u.thirdMethod();
            }
        }
    }

}
