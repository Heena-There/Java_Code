//2)==========
//1 
//0 1 
//1 0 1 
//0 1 0 1 
//1 0 1 0 1 
//0 1 0 1 0 1 

package Assignment;

import java.util.Scanner;

public class pattern_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print(j % 2 + " ");
			}System.out.println(" ");
		}
		

	}

}
