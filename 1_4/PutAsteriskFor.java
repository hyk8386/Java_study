package study04;

import java.util.Scanner;

public class PutAsteriskFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 개의 *를 표시할까요? : ");
		int n = stdIn.nextInt();
		int i;
		
		for(i=0; i<n; i++) {
			System.out.print("*");
		}
	}

}
