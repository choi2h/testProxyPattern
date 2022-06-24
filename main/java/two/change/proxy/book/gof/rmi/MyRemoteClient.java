package two.change.proxy.book.gof.rmi;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            // 레지스트리에서 리턴된 객체는 그냥 Object 형식이므로 반드시 캐스팅을 해야 한다.
            //
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            String s = service.sayHello();

            System.out.println(s);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
