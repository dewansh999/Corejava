public class Methodoverloading {
    public void add() {
        int a, b, c = 0;
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Add without parameter" + c);
    }

    public void add(int a, int b) {
        int c = 0;
        c = a + b;
        System.out.println("Add with parameter" + c);
    }

    public void add(float a, float b) {
        float c = 0;
        c = a + b;
        System.out.println("Add with two float parameter" + c);
    }
    public void add(String a, String b) {
        float c = 0;
        c = a + b;
        System.out.println("Add with two float parameter" + c);
    }

    public static void main(String[] args) {

    }

    public void show() {
    }
}