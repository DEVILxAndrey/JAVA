public class ChocolateBoiler {


    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance = null;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }

        return uniqueInstance;
    }

    public void fill()  {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Zapolnenie nagrevatelya molochno-shokoladnoi smes");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Slit nagretoe moloko and shokolad");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("Dovesti soderzhimoe do kipeniya");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
        } 

    public boolean isBoiled() {
        return boiled;
     }
}