// Import required packages

import java.rmi.*;
import java.io.*;
import java.util.*;
public class MyClient{
public static void main(String args[])
{
try
{
int a[]=new int[4];
BillTotal stub = (BillTotal)Naming.lookup("rmi://localhost/rmiapp");
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of kgs of potatoes :");
a[0]=sc.next();
System.out.println("Enter number of kgs of tomatoes :");
a[1]=sc.next();
System.out.println("Enter number of kgs of onions :");
a[2]=sc.next();
System.out.println("Enter number of kgs of spinach :");
a[3]=sc.next();
System.out.println("The total cost is "+stub.total(a));
}
catch(Exception e)
{
System.out.println(e);
}
}
}
