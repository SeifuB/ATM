
/* Admas University, School of Post Graduate Studies
Department of Computer Science-Section2
Course Name: Distributed Systems
Group Members:
Seifu Birega PGMGC/8062/20, Yordanos Woldu PGMGC/8053/20
Simon Gebre Yohanes PGMGC/8067/20, Habtamu Birhan PGMGC/8023/20
Fasil Teshome               , Genet Fikade
 */
package BankOperations;

//import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankInterface {
    
int withdraw(int a,int amt)throws RemoteException; 
int deposit(int b,int amt)throws RemoteException; 
int checkBalance(int amt)throws RemoteException; 
    
}
