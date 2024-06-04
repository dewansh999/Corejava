// public class Stringreverse {
//     public static void main(String[] args) {
//         String s = "Dewansh";
//         System.out.println("Original String:" + s);
//         StringBuilder sb = new StringBuilder(s);
//         String str = sb.reverse().toString();
//         System.out.println("After Reverse:" + str);
//     }
// }

public class Stringreverse {

    public static void main(String[] args) {
        String originalStr = "ABCDE";
        String reversedStr = "";
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            char ch = originalStr.charAt(i);
            reversedStr = reversedStr + ch;

        }
        System.out.println("Reversed string: " + reversedStr);
    }
}
