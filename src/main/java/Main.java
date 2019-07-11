/**
 * @ Description: 程序入口
 * @ Date: Created in 01:00 2019-07-11
 * @ Author: duanjiaxing
 */
import lombok.extern.slf4j.Slf4j;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.Objects;


@Slf4j
public class Main {
    private static String uri = "ws://localhost:8080/websocket";

    private static Session session;
    private void start() {
        WebSocketContainer container = null;
        try {
            container = ContainerProvider.getWebSocketContainer();
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
        try {
            URI r = URI.create(uri);
            session = Objects.requireNonNull(container).connectToServer(Client.class, r);
            log.info("获取到session ID 为 {}", session.getId());
        } catch (DeploymentException | IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Main client = new Main();
        client.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            do {
                input = br.readLine();

                if (!input.equals("exit")) {
                    session.getBasicRemote().sendText("javaclient: "+input);
                    session.getBasicRemote().getSendWriter();
                }
            } while (!input.equals("exit"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        session.close();


    }
}

