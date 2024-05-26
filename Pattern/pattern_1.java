//Patern Printing Programm
//1)   1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
//6 6 6 6 6 6 

package Assignment;

import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
		System.out.println(" ");
		}

	}

}
