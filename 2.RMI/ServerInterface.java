import java.rmi.*;
//going to use it remotely, so extend remote
public interface ServerInterface extends Remote {
    String concat(String a, String b) throws RemoteException;
    //concat method which is overriden in Servant class
}
