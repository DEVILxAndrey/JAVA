public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b2.setLength(32);

        b1.move();
        b2.move();
        b3.move();
    }
}

class Boat {
    private int length;

    public void setLength(int len) {
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.println("Drift");
    }
}

class Sailboat extends Boat {
    public void move() {
        System.out.println("Hoist the sails");
    }
}

class Rowboat extends Boat {
    public void move() {
        System.out.println("Row the boat");
    }
}