package DeccapStone;
import java.util.Arrays;

public class project {

	
	public static void main(String[] args) {
		
		int [] a_1 = {25,45,20};
		int [] b_1 = Arrays.copyOf(a_1, 5);
		System.out.println("Array Integer a_1:");
		arrayPrint(b_1);
		
	
		int[] b_1Array = Arrays.copyOf(b_1, 5);
		b_1[2] = 65;
		b_1[4] = 75;
		b_1 [1] = 100;
		System.out.println("Array Intger a_1:");
		arrayPrint(b_1);
	}

	public static void arrayPrint(int[] b_1) {
		 
		
		
		for (int Number: b_1) {
			System.out.println(Number);
	}
	}
}
	
