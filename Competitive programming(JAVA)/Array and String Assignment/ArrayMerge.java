import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {

        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array2 = { 11, 12, 13, 14, 15 };

        int length1 = array1.length;
        int length2 = array2.length;
        int newLength = length1 + length2;

        int[] newArray = new int[newLength];

        System.arraycopy(array1, 0, newArray, 0, length1);

        System.arraycopy(array2, 0, newArray, length1, length2);

        System.out.println("New array (After merging elements):");
        System.out.println(Arrays.toString(newArray));
    }
}
