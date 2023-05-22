import java.rmi.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            //create an object of implementor class
            Servant s = new Servant();
            //rmiregistry contains concat object , to indentify the it use nameing for that need to bind server name with object
            //rebind->to bind again if already binded
            Naming.rebind("Server", s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

