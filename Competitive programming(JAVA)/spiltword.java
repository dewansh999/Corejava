public class spiltword {
    public static void main(String[] args) {
        String str = "The sky is blue";
        str = str.trim();
        String sw[] = str.split(" ");
        String rs = " ";
        for (int i = sw.length - 1; i >= 0; i--) {
            System.out.print(" " + sw[i]);
        }
    }
}
