public class BeverageTestDrive
{
    public static void main (String[] args)
    {
        Tea tea = new Tea();
        Coffe coffe = new Coffe();
        CoffeWithHook cw = new CoffeWithHook();
        TeaWithHook tw = new TeaWithHook();

        System.out.println("------------------------");
        tea.prepareRecipe();

        System.out.println("------------------------");
        coffe.prepareRecipe();

        System.out.println("------------------------");
        cw.prepareRecipe();

        System.out.println("------------------------");
        tw.prepareRecipe();
    }
}