package Stevens_p1;

import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] code = new int[4];
		
		System.out.println("enter a encrypted four digit number (add a space between each number): ");
		
		for(int i = 0; i < 4; i++) {
			code[i] = s.nextInt();
		}
		
		int[] n1 = new int[4];
		
		for(int i = 0; i < 4; i++) {
			if(code[i] > 7)
			   n1[i] = (code[i] - 7);
			else
				n1[i] = ((code[i] + 7) - 4);
		}
		
		System.out.print("The decrypted code is: " + n1[2] + n1[3] + n1[0] + n1[1]);	
		
		s.close();
	}

}
