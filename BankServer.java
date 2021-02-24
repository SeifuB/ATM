/* Authors

Admas University, School of Post Graduate Studies
Department of Computer Science-Section2
Course Name: Distributed Systems

Project Members: 
Seifu Birega (ID: ), Yordanos Woldu(ID: ), Simeon(ID: ), Habtamu(ID), Fasil(), Genet()

 */
package BankOperations;

//import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BankServer 
{ 
public static void main(String args[]) 
{ 
try 
{ 
Registry r=LocateRegistry.createRegistry(5896);
BankImplementer bankimpl=new BankImplementer(); 
r.rebind("BankServer",bankimpl); 
System.out.println("Serevr is ready"); 
} 

catch(Exception e) 
{ 
System.out.println("Exception :"+e); 
} 
} 
} 
