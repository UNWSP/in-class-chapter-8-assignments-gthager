package parallelarrays;

public class Integers2 {
	public static void main(String[] args) {
		//variables
		int[] powers = new int[5];
		// fill and display array
		for (int i = 0; i < 5; i++) {
			powers[i] = (int) Math.pow(2, i+1);
			System.out.print(powers[i]+" ");
		}
		System.out.println();
		for (int i = 4; i > -1; i--) {
			System.out.print(powers[i]+" ");
		}
	}
}
