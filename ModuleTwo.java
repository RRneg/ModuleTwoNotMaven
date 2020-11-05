package ua.com.ModuleTwo;

import ua.com.ModuleTwo.EnDecryption.EnDecryption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModuleTwo {

    public static void main(String[] args) {
        String password = null;
        int flag = 1;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (flag != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("For Encrypt press 1    for Decrypt press 2");
            int choice = input.nextInt();
            System.out.println("Enter your pass");

            try {
                password = in.readLine();
            } catch (IOException ex) {
                System.out.println("Reading error");
            }

            System.out.println("Your string after En|Decryption");
            switch (choice) {
                case 1:
                    password = EnDecryption.encryption(password);
                    System.out.println(password);
                    break;
                case 2:
                    password = EnDecryption.decryption(password);
                    System.out.println(password);
                    break;
            }
            System.out.println("Press 0 for exit");
            flag = input.nextInt();
        }
    }
}

