package BankOperations;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BankImplementer extends UnicastRemoteObject implements BankInterface
{ 
public BankImplementer()throws RemoteException 
{} 
public int withdraw(int a,int amt)throws RemoteException 
{ 
amt=amt-a; 
return(amt); 
} 

public int deposit(int b,int amt)throws RemoteException 
{ 
amt=amt+b; 
return(amt); 
} 
public int checkBalance(int amt)throws RemoteException 
{ 
    //String x="Hello";
return(amt); 
} 
} 