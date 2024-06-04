class op {
    public void show() {
        System.out.println("This is parent class show method ");
    }
}

public class Methodoverriding extends op {
    public void show() {
        System.out.println("This is child class show method");
    }

    public static void main(String[] args) {
        Methodoverloading t = new Methodoverloading();
        t.show();

    }
}
