package exercicio29;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertArray {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	int[] items = {4,3,5,2,8,6};
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	for (int i = 0; i < items.length; i++) {
		
	list.add(items[i]);
	
	}
	
	System.out.println("adicione os numeros: ");
	list.add(input.nextInt());
	list.add(input.nextInt());
	
	System.out.println(list);
	
	
	}

}


