/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.Scanner;

/**
 *
 * @author leong
 */
public class DeliveryManMenu {

    public void DeliveryMan() {
        Scanner s = new Scanner(System.in);
        ListInterface<DeliveryManDomain> aList = new DataStructurePartB<DeliveryManDomain>();
        DeliveryManDomain dd = new DeliveryManDomain("Leong", "S001", "123456", "012-3456789", 18, "1963, Jalan G1", "Employed");
        aList.add(dd);
        aList.add(new DeliveryManDomain("JC", "S002", "123456", "012-3456789", 18, "1963, Jalan G1", "Employed"));
        aList.add(new DeliveryManDomain("CCCC", "S003", "123456", "012-3456789", 18, "1963, Jalan G1", "Employed"));
        aList.add(new DeliveryManDomain("HDGDGDG", "S004", "123456", "012-3456789", 18, "1963, Jalan G1", "Employed"));
        int selection = 0;

        do {
            System.out.println("Delivery Man System");
            System.out.println("=======================================");
            System.out.println("1. Register new Delivery Man");
            System.out.println("2. Remove Delivery Man");
            System.out.println("3. Display All Delivery Man");
            System.out.println("4. Update Delivery Man Details");
            System.out.println("0. Exit to main menu");
            System.out.println("=======================================");
            System.out.printf("Selection: ");
            selection = s.nextInt();
            s = new Scanner(System.in);
            if (selection == 1) {
                System.out.printf("Name: ");
                String name = s.nextLine();
                s = new Scanner(System.in);

                System.out.printf("ID: ");
                String ID = s.nextLine();
                s = new Scanner(System.in);

                System.out.printf("IC: ");
                String IC = s.nextLine();
                s = new Scanner(System.in);

                System.out.printf("Phone Number: ");
                String phoneNo = s.nextLine();
                s = new Scanner(System.in);

                System.out.printf("Age: ");
                int age = s.nextInt();
                s = new Scanner(System.in);

                System.out.printf("Address: ");
                String address = s.nextLine();
                s = new Scanner(System.in);

                System.out.printf("Status: ");
                String status = s.nextLine();
                s = new Scanner(System.in);

                dd = new DeliveryManDomain(name, ID, IC, phoneNo, age, address, status);
                aList.add(dd);
                System.out.println("Delivery Man added successfully");
            } else if (selection == 2) {
                System.out.printf("%3s %20s %20s %20s %20s %4s %20s %20s\n", "No.", "Name", "ID", "IC", "PhoneNumber", "Age", "Address", "Status");
                System.out.println("=========================================================================================================================");
                aList.getAll();
                System.out.printf("Delivery Man record to delete: ");
                int deleteNo = s.nextInt();
                s = new Scanner(System.in);
                aList.removeByPosition(deleteNo);
                System.out.println("Records Delete suceesfully!");
            } else if (selection == 3) {
                aList.getAll();
            } else if (selection == 4) {
                System.out.printf("%3s %20s %20s %20s %20s %4s %20s %20s\n", "No.", "Name", "ID", "IC", "PhoneNumber", "Age", "Address", "Status");
                System.out.println("=========================================================================================================================");
                aList.getAll();
                System.out.printf("Enter Delivery Man ID to update: ");
                String updateID = s.nextLine();
                s = new Scanner(System.in);
                
                System.out.printf("Name: ");
                String name = s.nextLine();
                s = new Scanner(System.in);

                System.out.printf("IC: ");
                String IC = s.nextLine();
                s = new Scanner(System.in);

                System.out.printf("Phone Number: ");
                String phoneNo = s.nextLine();
                s = new Scanner(System.in);

                System.out.printf("Age: ");
                int age = s.nextInt();
                s = new Scanner(System.in);

                System.out.printf("Address: ");
                String address = s.nextLine();
                s = new Scanner(System.in);

                System.out.printf("Status: ");
                String status = s.nextLine();
                s = new Scanner(System.in);
                
                dd = new DeliveryManDomain(name, updateID, IC, phoneNo, age, address, status);
                aList.replaceByID(updateID, dd);
            } else if (selection == 0) {

            } else {
                System.out.println("Selection is not available, please try again.");
            }
        } while (selection != 0);

    }
}
