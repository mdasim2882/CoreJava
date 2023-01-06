package Abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MailService {

    public void sendEmail() {
        connect();
        authenticate();

        // Specify mail here, and then
        disconnect();
    }

    // All other methods are declared as private to achieve abstraction
    private void connect() {
        System.out.println("Connect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

}
