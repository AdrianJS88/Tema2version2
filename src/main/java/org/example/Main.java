package org.example;

import java.util.Collections;
import java.util.Scanner;

import static org.example.Agenda.*;

public class Main {
    public static void main(String[] args) {
        Agenda agenda=new Agenda();
        Agenda.phoneBook.add(Collections.singletonList(name));
        Agenda.phoneBook.add(Collections.singletonList(number));

        Scanner sc = new Scanner(System.in);
        boolean Exit = false;

        int Options;

        while (!Exit) {

            System.out.println("1. LIST OF CONTACTS ");
            System.out.println("2. ADD CONTACT");
            System.out.println("3. REMOVE CONTACT");
            System.out.println("4. REPLACE CONTACT");
            System.out.println("5. SEARCH CONTACT");
            System.out.println("6. EXIT");

            try {
                System.out.println(" PLEASE CHOOSE A OPTION");
                Options = sc.nextInt();

                switch (Options) {
                    case 1:
                        print();
                        break;
                    case 2:
                        addName();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        replace();
                        break;
                    case 5:

                        search();
                        break;
                    case 6:
                        Exit = true;
                        System.out.println("YOU HAVE EXIT DE PROGRAM");
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}