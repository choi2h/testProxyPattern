package two.change.proxy.book.gof.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    /*
        상속받은 UnicastRemoteObject의 생성자가 RemoteException을 던짐
        슈퍼클래스의 생성자가 어떤 예외를 던진다면 서브클래스의 생성자도 그 예외를 선언해줘야 한다.
     */
    protected MyRemoteImpl() throws RemoteException {
    }


    @Override
    public String sayHello() {
        return "Server says, 'Hey'";
    }

}
