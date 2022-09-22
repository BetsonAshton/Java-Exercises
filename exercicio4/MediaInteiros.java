package exercicio4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MediaInteiros {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Set<Integer> a = new TreeSet<Integer>();

		a.add(input.nextInt());
		a.add(input.nextInt());
		a.add(input.nextInt());
		a.add(input.nextInt());
		a.add(input.nextInt());

		for (Integer i : a) {
			System.out.println(i / 2);
		}

		input.close();

	}

}
