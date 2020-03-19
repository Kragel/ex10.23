package t_10_innerClasses.ex23;

public class A {

    public U getU()
    {
        return new U() {

            @Override
            public void thirdMethod()
            {
                System.out.println("thirdMethod");
            }

            @Override
            public void secondMethod()
            {
                System.out.println("secondMethod");
            }

            @Override
            public void firstMethod()
            {
                System.out.println("firstMethod");
            }
        };
    }

}
