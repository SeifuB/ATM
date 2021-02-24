/*This interace is prepare for Banking Operations and  implements
The Withdrawal
    Check Balance and
    Deposit functionalities
 */
package BankOperations;

//import java.rmi.Remote;
import java.rmi.RemoteException;

/* Admas University, School of Post Graduate Studies
Department of Computer Science-Section2
Course Name: Distributed Systems

 */
public interface BankInterface {
    
int withdraw(int a,int amt)throws RemoteException; 
int deposit(int b,int amt)throws RemoteException; 
int checkBalance(int amt)throws RemoteException; 
    
}
