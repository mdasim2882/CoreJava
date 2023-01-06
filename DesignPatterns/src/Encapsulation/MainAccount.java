package Encapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAccount {


    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);

        System.out.println(account.getBalance());

    }
}
