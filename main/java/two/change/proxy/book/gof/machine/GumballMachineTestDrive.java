package two.change.proxy.book.gof.machine;

import java.rmi.Naming;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        int count = 0;

        if(args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }


        try{
            count = Integer.parseInt(args[1]);

            GumballMachine gumballMachine = new GumballMachine(args[0], count);
            //Naming.rebind() 메소드를 통해 GumbalMachine 스텁을 gumballmachine이름으로 등록
            Naming.rebind("gumballmachine1", gumballMachine);
            System.out.println("Success!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
