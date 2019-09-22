package Stevens_p3;

import java.util.Scanner;



public class polling {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] topics = {"Politics", "Enviornment", "Technology", "Sports", "Food"}; 
		int[][] responses= new int[5][10];
		
		System.out.println("Rate these issues from most to leat important: ");
		System.out.println("1 = least important, 10 = most important");
		System.out.println("Politics, Enviornment, Technology, Sports, and Food");
		System.out.println("");
		
		int k= 0;
		char an = 'y';
		while(an == 'y') {
			int j = 0;
		for(int i = 0; i < 1; i++) {
			System.out.println("Enter rating for Politics: ");
			responses[i][0] = responses[i][0] + s.nextInt();
			System.out.println("Enter rating for Enviornment: ");
			responses[i][1] = responses[i][1] + s.nextInt();
			System.out.println("Enter rating for Technology");
			responses[i][2] = responses[i][2] + s.nextInt();
			System.out.println("Enter rating for Sports: ");
			responses[i][3] = responses[i][3] + s.nextInt();
			System.out.println("Enter rating for Food: ");
			responses[i][4] = responses[i][4] + s.nextInt();
			
		}
			System.out.println("Would more people like to take the survey? Enter y of n");
			an = s.next().charAt(0);
			j++;
			j = k;
		}
		
		String high = " ";
		for(int i = 0; i < 1; i++) {
			if ((responses[i][0] >=  responses[i][1]) && (responses[i][0] >=  responses[i][2]) && (responses[i][0] >=  responses[i][3]) && ( responses[i][0] >=  responses[i][4])) { 
			    high = topics[0];
			} else if (( responses[i][1] >=  responses[i][3]) && ( responses[i][1] >=  responses[i][4]) && ( responses[i][1] >=  responses[i][4])) {      
				high = topics[1];
			} else if (( responses[i][2] >= responses[i][3]) && (responses[i][2] >= responses[i][4])) {                  
				high = topics[2];
			} else if (responses[i][3] >=  responses[i][4]) {                               
				high = topics[3];
			} else {                                          
				high = topics[4];
			}
		}
		
		String low = " ";
		for(int i = 0; i < 1; i++) {
			if ((responses[i][0] <=  responses[i][1]) && (responses[i][0] <=  responses[i][2]) && (responses[i][0] <=  responses[i][3]) && ( responses[i][0] <=  responses[i][4])) { 
			    low = topics[0];
			} else if (( responses[i][1] <=  responses[i][3]) && ( responses[i][1] <=  responses[i][4]) && ( responses[i][1] <=  responses[i][4])) {      
				low = topics[1];
			} else if (( responses[i][2] <= responses[i][3]) && (responses[i][2] <= responses[i][4])) {                  
				low = topics[2];
			} else if (responses[i][3] <=  responses[i][4]) {                               
				low = topics[3];
			} else {                                          
				low = topics[4];
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("                   Total Points                   Average");
			System.out.println(topics[0] +         responses[i][0] +              responses[i][0]/k);
			System.out.println(" ");
			System.out.println(topics[1] +         responses[i][1] +              responses[i][0]/k);
			System.out.println(" ");
			System.out.println(topics[2]  +        responses[i][2] +              responses[i][0]/k);
			System.out.println(" ");
			System.out.println(topics[3]  +        responses[i][3] +              responses[i][0]/k);          
			System.out.println(" ");
			System.out.println(topics[4] +         responses[i][4] +              responses[i][0]/k);
			System.out.println(" ");
			System.out.println("Highest score: " + high);
		}
		s.close();
	
		}	
}