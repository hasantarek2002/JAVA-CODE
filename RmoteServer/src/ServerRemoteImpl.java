

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerRemoteImpl extends UnicastRemoteObject implements ServerRemote {

	protected ServerRemoteImpl() throws RemoteException {
	}

	@Override
	public String getUsername() throws RemoteException {
		return System.getProperty("user.name");
	}

	public static void main(String[] args) {
		try {
			ServerRemote serverRemote = new ServerRemoteImpl();
			Naming.rebind("RemoteUsername", serverRemote);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
