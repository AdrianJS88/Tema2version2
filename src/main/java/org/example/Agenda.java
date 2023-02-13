package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    static List<List<Object>> phoneBook = new ArrayList<>();
    static List<String> name = new ArrayList<>();
    static List<Integer> number = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void print() {
        try {
            for (int i = 0; i < name.size(); i++) {
                System.out.println("Name: " + name.get(i) + " Number: " + number.get(i));
            }
        } catch (Exception e) {
            System.out.println("Please enter a contact name!!!");
        }


    }

    public static void addName() {
        try {
            System.out.println("name:");
            String sc = new Scanner(System.in).nextLine();
            name.add(sc);
            System.out.println("number");
            String sc2 = new Scanner(System.in).nextLine();
            number.add(Integer.valueOf(sc2));
        } catch (NumberFormatException e) {
            System.out.println("Please enter a contact name!!!");
        }

    }

    //insertion method
    public static void replace()  {
        try {
            //replace item
            System.out.println("ENTER THE CONTACT NAME  TO REPLACE:");
            String sc5 = new Scanner(System.in).nextLine().toLowerCase();

            for (int i = 0; i < name.size(); i++) {
                name.set(name.indexOf(sc5), sc.next());

            }
            for (int i = 0; i < number.size(); i++) {
                name.set(number.indexOf(sc5), sc.next());

            }
            //to be continued
        } catch (Exception e) {
            System.out.println("Please enter a contact name!!!");
        }

    }


    //delete method
    public static void delete(){
        try {
            System.out.println("Enter name to delete:");
            String sc = new Scanner(System.in).nextLine();
            for (int i = 0; i < name.size() ; i++) {
                if (sc.equals(name.get(i))){
                    name.remove(i);
                } for (int j = 0; j < name.size() ; j++) {
                    if (sc.equals(name.get(j))) {
                        number.remove(j);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Please enter a contact name!!!");
        }
    }

    //searching  method
    public static  void search() {
        String sc = new Scanner(System.in).nextLine();
        try {
            for (int i = 0; i <= name.size(); i++) {
                if (name.get(i).equals(sc)) {
                    System.out.println(sc + "contact found!! \n Number:" + name.get(i));
                    break;
                }
            }
        } catch (IndexOutOfBoundsException m) {
            System.out.println(sc + " not found !!");
        }


    }

}
