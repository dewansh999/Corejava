// public class loop {
//     public static void main(String[] args) {
//         for (int i = 10; i < 21; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }
public class loop {
    public static void main(String[] args) {
        for (int i = 10; i < 21; i = i + 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
