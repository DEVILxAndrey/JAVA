public class ChocolateBoilerSingl {
    public static void main (String[] args) {
        ChocolateBoiler cb1 = ChocolateBoiler.getInstance();
        ChocolateBoiler cb2 = ChocolateBoiler.getInstance();

        cb1.fill();
        cb2.fill();

        cb1.boil();
        cb2.boil();

        cb1.drain();
        cb2.drain();

    }
}