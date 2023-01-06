package Abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAbstraction {
    public static void main(String[] args) {
        MailService mailService = new MailService();
        // Here, abstraction causes visibility of sendEmail() only to mailService reference
        mailService.sendEmail();
    }
}
