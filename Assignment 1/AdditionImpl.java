
//DS Assignment 1: Implement multi-threaded client/server Process communication using RMI.
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdditionImpl extends UnicastRemoteObject implements Addition {

	public AdditionImpl() throws RemoteException {
		super();
	}

	public int addition(int a, int b) {
		return a+b;
	}
}
