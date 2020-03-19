package t_10_innerClasses.ex23;

public class App {

    public static void main(String[] args)
    {
        A a1 = new A();
        A a2 = new A();

        B b = new B();

        System.out.println("\nSAVE\n");

        b.saveU(0, a1.getU());
        b.saveU(1, a1.getU());
        b.saveU(2, a2.getU());
        b.saveU(3, a2.getU());

        b.process();

        System.out.println("\nDELETE\n");

        b.deleteU(1);
        b.deleteU(3);

        b.process();
    }

}
