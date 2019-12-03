// Import required packages
import java.rmi.*;
public interface BillTotal extends Remote{
	public long total(int[] a) throws RemoteException;
}
