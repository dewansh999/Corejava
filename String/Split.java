public class Split {
    public static void main(String[] args) {
        String s = "Hello World bhopal";
        String arr[] = s.split("W");
        for (String string : arr) {
            System.out.println(string);

        }
        System.out.println("Number of words :" + arr.length);
    }
}
