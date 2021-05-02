
public class Loopexample {
	
	public static void main(String []args)
	{
		for(int i=0;i<100;i++)
		{
			int y=i*(i+1);
			if (y%2==0)
			{
			   System.out.println("Result "+ y+ " is even");
			}
			else
			{
				System.out.println("Result "+ y+" is odd");
			}
		}
	}

}
