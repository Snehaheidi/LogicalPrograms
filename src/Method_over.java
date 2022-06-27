class Super
{
	int m,n;
	Super(int x,int y)    // create constrctor
	{
		m = x;
		n = y;
	}
	int largest()
	{
		if(m >= n)
		{
			return m;
		}
		else
		{
			return n;
		}
	}
	void display()   
	{
		int large = largest();   // method call 
		System.out.println("The Largest Value = "+large);
	}
}
public class Method_over {

	public static void main(String[] args) 
	{
		Super Sub1 = new Super(50,40);  // object create -> constrctor method -> value assign 
	    Sub1.display();  // method call ->object
	}
}
