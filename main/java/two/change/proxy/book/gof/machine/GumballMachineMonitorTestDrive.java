package two.change.proxy.book.gof.machine;

import java.rmi.Naming;

public class GumballMachineMonitorTestDrive {

    public static void main(String[] args) {
        String location = "rmi://127.0.0.1/gumballmachine1";
        try{
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);
            GumballMonitor monitor = new GumballMonitor(machine);
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
