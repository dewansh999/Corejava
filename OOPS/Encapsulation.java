public class Encapsulation {
    private int x;
    private int y;

    // member data
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Encapsulation p = new Encapsulation();
        System.out.println("X_CO :" + p.getX());
        System.out.println("Y_CO :" + p.getY());
        p.setX(100);
        p.setY(200);
        System.out.println("X_CO :" + p.getX());
        System.out.println("X_CO :" + p.getY());
    }
}