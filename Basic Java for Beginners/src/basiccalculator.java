/**
 * 
 */

/**
 * @author Soumik
 *
 */
public class basiccalculator {
	
	private float value1;
	private float value2;
	public basiccalculator() 
	{
		super();
		this.value1=0;
		this.value2=0;
		
		
	}
	
	public float add(float value1,float value2)
	{
		this.value1=value1;
		this.value2=value2;
		float result=this.value1+this.value2;
	    return result;
	}
	public float minus(float value1,float value2)
	{
		this.value1=value1;
		this.value2=value2;
		return this.value1-this.value2;
	}
	public float divide(float value1,float value2)
	{
		this.value1=value1;
		this.value2=value2;
		float result=this.value1/this.value2;
		return result;
		
	}
	public float multiply(float value1,float value2)
	{
		this.value1=value1;
		this.value2=value2;
		float result=this.value1*this.value2;
		return result;
	}
	

}
