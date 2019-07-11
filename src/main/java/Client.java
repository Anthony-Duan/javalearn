import javax.websocket.*;

/**
 * @ Description: websocket java客户端
 * @ Date: Created in 00:42 2019-07-11
 * @ Author: duanjiaxing
 */
@ClientEndpoint
public class Client {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected to endpoint: " + session.getBasicRemote());
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println(message);
    }

    @OnError
    public void onError(Throwable t) {
        t.printStackTrace();
    }

    @OnClose
    public void onClose() {
        System.out.println("该连接已经关闭");
    }

}