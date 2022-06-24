package two.change.proxy.book.gof.machine;

public class NoQuarterState implements State{
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumbalMachine;

    @Override
    public void insertQuarter() {
        System.out.println("NoQuarterState - insertQuarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("NoQuarterState - ejectQuarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("NoQuarterState - turnCrank");
    }

    @Override
    public void dispense() {
        System.out.println("NoQuarterState - dispense");
    }
}
