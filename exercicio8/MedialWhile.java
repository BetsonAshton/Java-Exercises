package exercicio8;

import java.util.Scanner;

public class MedialWhile {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int i = input.nextInt();
		int n = input.nextInt();
		int c = input.nextInt();
		int a = input.nextInt();
		int d = input.nextInt();

		double media = (i + n + c + a + d) / 5.0;

		while (media < 5) {
			System.out.println(media);
			break;

		}

		input.close();
	}

}
