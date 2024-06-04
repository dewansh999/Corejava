public class remove {
  public static void main(String[] args) {
    String s1 = "all the best";
    char[] s = s1.toCharArray();
    for (int i = 0; i < s1.length(); i++) {
      if (s[i] == ' ') {
        continue;
      }
      System.out.print(s[i]);
    }
  }
}
// This is like a story about a robot that loves to read.
// The robot has a special book called "s1" that says "all the best".
// The robot wants to read this book but it doesn't like spaces.
// So, it takes out a magnifying glass and looks at each letter in the book.
// If it sees a space, it skips it and moves to the next letter.
// If it sees a letter, it reads it out loud.
// This way, the robot reads the book without any spaces.