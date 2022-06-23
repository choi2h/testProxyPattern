package two.change.proxy.book.gof.machine;

public class GumbalMonitor {
    private GumbalMachine machine;

    public GumbalMonitor(GumbalMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("뽑기 기계 위치: " + machine.getLocation());
        System.out.println("현재 재고: " + machine.getCount());
        System.out.println("현재 상태: " + machine.getStatus());
    }
}
