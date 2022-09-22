package exercicio28;

/* Write a Java program to calculate the average value of array elements
 * 
 */
public class CalculoeMediaArray {

	public static void main(String[] args) {

		int[] numbers = new int[] { 20, 30, 25, 35, -16, 60, -100 };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++)

			sum = sum + numbers[i];

		double average = sum / numbers.length;

		System.out.println("A média dos valores nos elementos do array será " + average);

	}
}
