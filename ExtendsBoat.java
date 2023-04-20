public class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.print("Давай, Наташа!");
    }
}

public class Boat {
    private int length;

    public void setLength(int len) {
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void moved() {
        System.out.print("Дрейф");
    }
}