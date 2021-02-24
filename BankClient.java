/* Admas University, School of Post Graduate Studies
Department of Computer Science-Section2
Course Name: Distributed Systems

 */
package BankOperations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class BankClient 
{ 
public static void main(String args[]) 
{ 
int ch; 
try 
{ 
String bankserverURL="//192.168.0.185:5896/BankServer"; 
BankInterface bankintf=(BankInterface)Naming.lookup(bankserverURL); 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("\nEnter the UserName:"); 
String s=br.readLine(); 
System.out.println("\nEnter the Account Number:"); 
int ac=Integer.parseInt(br.readLine()); 
System.out.println("\nEnter the Initial Amount:"); 
int amt=Integer.parseInt(br.readLine()); 
do 
{ 
System.out.println("\n\t1.Withdraw\n\t2.Deposit\n\t3.Balance\n\t4.Exit");	
System.out.println("\nEnter your choice:"); 
ch=Integer.parseInt(br.readLine()); 
switch(ch) 
{ 
case 1: 
System.out.println("\nEnter amount of Withdraw:"); 
int wd=Integer.parseInt(br.readLine()); 
System.out.println("\nUserName:"+s); 
System.out.println("Account Number:"+ac); 
if(wd>amt) 
System.out.println("Balance less unable to proceed withdraw"); 
else 
{ 
amt=bankintf.withdraw(wd,amt); 
System.out.println("Balance:"+amt); 
} 
break; 
case 2: 
System.out.println("\nEnter amount of deposit:"); 
int dp=Integer.parseInt(br.readLine()); 
System.out.println("\nUserName:"+s); 
System.out.println("Account Number:"+ac); 
amt=bankintf.deposit(dp,amt); 
System.out.println("Balance:"+amt); 
break; 
case 3: 
System.out.println("\nUserName:"+s); 
System.out.println("Account Number:"+ac); 
amt=bankintf.checkBalance(amt); 
System.out.println("Balance:"+amt); 
break; 
} 
}while(ch<4); 
} catch(Exception e) 
{ 
System.out.println("Exception :"+e); 
} 
} 
} 
