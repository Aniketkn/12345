
//DS Assignment 1: Implement multi-threaded client/server Process communication using RMI.
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Addition extends Remote {

	public int addition(int a, int b) throws RemoteException;

}
