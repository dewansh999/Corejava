class This1 {
  String name;
  String course;
  float fees;
  String batch;
  int duration;
  boolean isPlaced;

  // Member data

  public This1() {
    System.out.println("Default constructor is Called");
    name = "GUEST";
    course = "JAVA FULL STACK";
    fees = 50000f;
    batch = "J4";
    duration = 6;
    isPlaced = false;
  }

  public This1(String name, String course, float fees, String batch, int duration, boolean isPlaced) {
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

  void abc() {
    this.showData(); // call current class method
  }

  public static void main(String args[]) {
    This1 c1 = new This1("Ram", "JAVA FULL STACK", 45600, "J4", 6, false);
    This1 c2 = new This1();
    System.out.println("This1 is c1 Object data");
    c1.abc();
    System.out.println("This1 is c2 Object data");
    c2.showData();
  }
}
