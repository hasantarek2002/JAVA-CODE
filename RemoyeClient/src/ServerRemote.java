

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerRemote extends Remote{

	public String getUsername() throws RemoteException;
}
