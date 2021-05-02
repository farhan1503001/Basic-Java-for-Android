import java.util.Scanner;

public class calculator {
	
	public static void main(String []args)
	{
		float num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1=sc.nextFloat();
		System.out.println("Enter the second number: ");
		num2=sc.nextFloat();
		System.out.println("Enter the operation command");
		String operation=sc.next();
		float result=0;
		if(operation.equalsIgnoreCase("add"))
		{
			result=num1+num2;
			System.out.println("Result is: "+result);
			
			
		}
		else if (operation.equalsIgnoreCase("substract"))
		{
			result=num1-num2;
			System.out.println("Result is: "+result);
			
		}
		else if(operation.equalsIgnoreCase("Multiply"))
		{
			result=num1*num2;
			System.out.println("Result is: "+result);
		}
		else if(operation.equalsIgnoreCase("Divide"))
		{
			result=num1/num2;
			System.out.println("Result is: "+result);
		}
	
	}
 
}
