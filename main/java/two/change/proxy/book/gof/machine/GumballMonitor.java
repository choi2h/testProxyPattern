package two.change.proxy.book.gof.machine;

import java.rmi.RemoteException;

public class GumballMonitor {
    private GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("뽑기 기계 위치: " + machine.getLocation());
            System.out.println("현재 재고: " + machine.getCount());
            System.out.println("현재 상태: " + machine.getStatus());
        } catch (RemoteException re) {
            re.printStackTrace();
        }
    }
}
