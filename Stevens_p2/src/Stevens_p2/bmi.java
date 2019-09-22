package Stevens_p2;
import java.util.Scanner;

public class bmi 
{

	public static void main(String[] args) 
	{
		System.out.println("Are you using Metric or Standard measurement? (enter 1 or 2 to select item)");
		System.out.println("1. Metric");
		System.out.println("2. Standard");
		
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		
		if(input == 1) 
		{
			System.out.println("Enter youyr weight in Kilograms: ");
			float kg = s.nextInt();
			
			System.out.println("Enter your height in meters: ");
			float meters = s.nextInt();
			
			float BMI = kg / (meters * meters);
			
			System.out.println("Your BMI is: " + BMI);
			System.out.println("-----------------------");
			System.out.println("Underweight: < 18.5");
			System.out.println("Normal: 18.5 - 24.9");
			System.out.println("Overweight: 25 - 29.9");
			System.out.println("Obesity: 30 and above");
			s.close();
	    }
		
		if(input == 2)
		{
			System.out.println("Enter your weight in Pounds: ");
			float lb = s.nextInt();
			
			System.out.println("Enter your height in inches: ");
			float inches = s.nextInt();
			
			float BMI = (703 * lb) / (inches * inches);
			
			System.out.println("Your BMI is: " + BMI);
			System.out.println("-----------------------");
			System.out.println("Underweight: < 18.5");
			System.out.println("Normal: 18.5 - 24.9");
			System.out.println("Overweight: 25 - 29.9");
			System.out.println("Obesity: 30 and above");
			s.close();


		}

	}
}