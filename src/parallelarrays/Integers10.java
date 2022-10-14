package parallelarrays;

public class Integers10 {
	public static void main(String[] args) {
		//variables 
		int[] tenMult = {10,20,30,40,50,60};
		int sum = 0;
		int avg = 0;
		//displays integers
		for (int i = 0; i < tenMult.length; i++) {
			System.out.print(tenMult[i]+" ");
			sum += tenMult[i];
			}
		System.out.println();
		for (int i = tenMult.length-1; i > -1; i--) {
			System.out.print(tenMult[i]+" ");
			}
		System.out.println();
		//displays the sum
		System.out.println(sum);
		//finds the average
		avg = sum/tenMult.length;
		System.out.print(avg);
		
	}
}
