package two.change.proxy.book.gof.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {

    /*
    모든 원격 메소드 호출은 위험이 따름
    각종 입출력 작업 처리 시 에러를 대비하여 모든 모세드에 RemoteException을 던지도록 선언해준다.

    원격 메소드의 인자와 리턴값은 반드시 원시 형식(primitive type) 또는 Serializable 형식으로 선언해야 한다.
    모두 네트워크로 전달되어야 하며, 직렬화로 포장됨
     */
    String sayHello() throws RemoteException;
}
