// Import required packages
import java.rmi.*;
public class MyServer
{
	public static void main(String args[])
	{
		try
		{
			BillTotal stub = new BillTotalRemote();
			Naming.rebind("rmi://localhost/rmiapp",stub);
			System.out.println("Server is ready............");
			System.out.println("Remote object is ready..........");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
