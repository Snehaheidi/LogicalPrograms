
class Table
{
	synchronized void print(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*n);
		}
	}
}
public class Synch {

	public static void main(String[] args) throws Exception 
	{
		Table table = new Table();
		Thread table1 = new Thread()
		{
          public void run()
          {
        	  table.print(5);
          }
		};
		Thread table2 = new Thread()
		{
          public void run()
          {
        	  table.print(10);
          }
		};
		table1.start();
		//table1.join();
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		table2.start();
	}
}
