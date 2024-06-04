// It is used to provide different values to distinct Objects.
// public class This {

// void show() {
// System.out.println(this);
// }

// public static void main(String[] args) {
// This r = new This();
// System.out.println(r);
// r.show();
// }

// }
class This {
    String name;
    String course;
    float fees;
    String batch;
    int duration;
    boolean isPlaced;

    // Member data

    This() {
        System.out.println("Default constructor is Called");
        name = "GUEST";
        course = "JAVA FULL STACK";
        fees = 50000f;
        batch = "J4";
        duration = 6;
        isPlaced = false;
    }

    This(String name, String course, float fees, String batch, int duration, boolean isPlaced) {
        System.out.println("Parameterized constructor is Called");
        this.name = name;
        this.course = course;
        this.fees = fees;
        this.batch = batch;
        this.duration = duration;
        this.isPlaced = isPlaced;
    }

    void showData() {
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Fees : " + fees);
        System.out.println("Batch : " + batch);
        System.out.println("Duration : " + duration);
        System.out.println("IsPlaced : " + isPlaced);
    }

    public static void main(String args[]) {
        This c1 = new This("Ram", "JAVA FULL STACK", 45600, "J4", 6, false);
        This c2 = new This();
        System.out.println("This is c1 Object data");
        c1.showData();
        System.out.println("This is c2 Object data");
        c2.showData();
    }
}
