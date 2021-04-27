import java.io.IOException;

public class ClientStart {
    public static void main(String[] args) throws IOException {
        Client aClient = new Client("192.168.0.106", 5050);
        CCommunicator.aClient = aClient;
        new LoginGUI();
        System.out.println(aClient.Read());
    }
}