package two.change.proxy.book.gof.machine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private int count;
    private String location;
    private String status;

    public GumballMachine(String location, int count) throws RemoteException{
        this.location = location;
        this.count = count;
        this.status = "대기 중";
    }

    public String getLocation() {
        return this.location;
    }

    public int getCount() {
        return this.count;
    }

    public String getStatus() {
        return this.status;
    }
}
