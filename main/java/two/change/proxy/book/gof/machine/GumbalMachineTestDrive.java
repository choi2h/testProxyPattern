package two.change.proxy.book.gof.machine;

public class GumbalMachineTestDrive {

    public static void main(String[] args) {
        int count = 0;

        if(args.length < 2) {
            System.out.println("GumbalMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumbalMachine gumbalMachine = new GumbalMachine(args[0], count);

        GumbalMonitor gumbalMonitor = new GumbalMonitor(gumbalMachine);

        gumbalMonitor.report();
    }
}
