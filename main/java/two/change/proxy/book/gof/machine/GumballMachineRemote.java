package two.change.proxy.book.gof.machine;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    String getStatus() throws RemoteException;
}
