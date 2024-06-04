import java.util.Scanner;

public class Converting {

	public static void main(String[] args) {
		System.out.println("Enter a decimal number:");
		try (Scanner sk = new Scanner(System.in)) {
			int decimalNumber = sk.nextInt();
			int[] binaryArray = new int[32]; // Assuming a maximum of 32-bit binary representation

			int index = 0;
			while (decimalNumber > 0) {
				binaryArray[index++] = decimalNumber % 2;
				decimalNumber /= 2;
			}

			if (index == 0) {
				System.out.println("Binary Number: 0");
			} else {
				System.out.println("Binary Number:");
				for (int i = index - 1; i >= 0; i--) {
					System.out.print(binaryArray[i]);
				}
				System.out.println();
			}
		}
	}
}
