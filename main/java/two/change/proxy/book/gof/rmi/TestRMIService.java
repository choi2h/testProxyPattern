package two.change.proxy.book.gof.rmi;

import java.rmi.Naming;

public class TestRMIService {

    /*
        rmi.Naming을 통해 Service를 RMI에 등록
        서비스를 구현한 객체를 등록하면 RMI 시스템은 레지스트리에 스텁만 등록
     */
    public void testRemoteRequest() {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
