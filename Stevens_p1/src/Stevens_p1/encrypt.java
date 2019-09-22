package Stevens_p1;

import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] code = new int[4];
		
		System.out.println("Enter an unencrypted four digit number (place a space between each number): ");
		
		for(int i = 0; i < 4; i++) {
			code[i] = s.nextInt();
		}
		
		int n1 = (code[0] + 7) % 10;
		int n2 = (code[1] + 7) % 10;
		int n3 = (code[2] + 7) % 10;
		int n4 = (code[3] + 7) % 10;
		
		System.out.print("The encrypted code is: " + n3 + n4 + n1 + n2);	
		
		s.close();
	
		
	}
}