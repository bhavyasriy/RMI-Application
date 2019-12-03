import java.rmi.*;
import java.rmi.server.*;
public class BillTotalRemote extends UnicastRemoteObject implements BillTotal
{
BillTotalRemote() throws RemoteException
{
	super();
}
public long total(int a[])
	{
		long sum=0;
		sum+=a[0]*17/(float)5;
		sum+=a[1]*8;
		sum+=a[2]*20/(float)5;
		sum+=a[3]*12;
		return sum;
	}
}

