import java.rmi.Naming;
 
public class ClientRemote {
    public static void main(String[] args) {
        new ClientRemote().go();
    }
 
    public void go() {
        try {
            ServerRemote serverRemote = (ServerRemote) Naming.lookup("rmi://127.0.0.1/RemoteUsername");
            System.out.println(serverRemote.getUsername());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
 
    }
}