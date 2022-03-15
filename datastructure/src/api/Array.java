package api;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int ns = Integer.parseInt(s1);
		int[] num = new int[ns];

		System.out.println("for 문");
		for (int i = 0; i < ns; i++) {
			num[i] = (i + 1) * 10;
			System.out.println("num[%d] = %d".formatted(i, num[i]));
		}
		System.out.println();

		System.out.println("while 문");
		int j = 0;
		while (num.length > j) {
			System.out.println("num[%d] = %d".formatted(j, num[j]));
			j++;
		}
		System.out.println("배열의 크기: " + num.length);

	}

}
