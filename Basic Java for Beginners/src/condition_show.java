import java.util.Scanner;

public class condition_show {
	
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int marks =scan.nextInt();
		if(marks<33)
		{
			System.out.println("Grade: is F");
		}
		else if(marks>=33 & marks<=39)
		{
			System.out.println("Grade is E");

		}
		else if(marks>=40 & marks<=49)
		{
			System.out.println("Grade is D");
		}
		else if(marks>=50 & marks<=59)
		{
			System.out.println("Grade is C");
		}
		else if(marks>=60 & marks<=69)
		{
			System.out.println("Grade is B");
		}
		else if(marks>=70 & marks<=79)
		{
			System.out.println("Grade is A");
		}
		else if(marks>=80 & marks<=100)
		{
			System.out.println("Grade is A+");
		}
		else
		{
			System.out.println("Result not valid");
		}
	}

}
