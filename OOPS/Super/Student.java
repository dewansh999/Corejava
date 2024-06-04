import java.util.Scanner;

class Student extends College {
  protected String sname;
  protected String enroll;

  Student() {
    System.out.println("This is Student class Default constructor");
  }

  Student(String cname, int code, String sname, String enroll) {
    super(cname, code);
    this.sname = sname;
    this.enroll = enroll;
    System.out.println("This is Student class Parameterized constructor");
  }

  public void getData() {
    super.acceptData();
    Scanner sk = new Scanner(System.in);
    System.out.println("Enter Student Name :");

    sname = sk.nextLine();
    System.out.println("Enter Student Enrollment : ");
    enroll = sk.nextLine();
  }

  public void viewData() {
    super.showData();
    System.out.println("Student Name :" + sname);
    System.out.println("Student Enrollment :" + enroll);

  }

  public static void main(String args[]) {
    // Student s = new Student();
    Student s = new Student("LNCT", 103, "Ram", "0103CS181022");

    s.getData();
    s.viewData();
  }
}
