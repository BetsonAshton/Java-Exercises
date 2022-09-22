package exercicio14;

import java.util.Scanner;

public class SomaArray {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int[] numbers = new int[num];
		int sum = 0;

		System.out.println("Entre com os elementos do array: ");

		for (int n = 0; n < num; n++) {

			int x = input.nextInt();

			numbers[n] = x;

		}

		for (int i = 0; i < numbers.length; i++) {

			sum = sum + numbers[i];

		}
		System.out.println(sum);

		input.close();
	}

}
