import java.util.Scanner;

public class calculation_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basiccalculator c= new basiccalculator();
        System.out.println("Which operations to perform?");
        Scanner s=new Scanner(System.in);
        int operation=s.nextInt();
        System.out.println("Enter the two values: ");
        float a=s.nextFloat();
        float b=s.nextFloat();
        switch(operation)
        {
        case 1:
        	System.out.println("Addition value is "+c.add(a,b));
        	break;
        case 2:
        	System.out.println("Division value is "+c.divide(a,b));
        	break;
        case 3:
        	System.out.println("Multiplication value is "+c.multiply(a,b));
        	break;
        case 4:
        	System.out.print("Substraction value is "+c.minus(a,b));
        	break;
        default:
        	System.out.println("Operation is not correct");
        	
        }
	}

}
