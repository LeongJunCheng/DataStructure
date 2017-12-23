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
public class CombineAll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int selection = 0;
        do {
            System.out.println("Main Menu");
            System.out.println("====================================================");
            System.out.println("1. Delivery Man Menu");
            System.out.println("0. Exit the system");
            System.out.println("====================================================");
            System.out.printf("Enter your selection: ");
            selection = s.nextInt();
            s = new Scanner(System.in);
            
            if (selection == 1) {
                DeliveryManMenu dmm = new DeliveryManMenu();
                dmm.DeliveryMan();
            } else if (selection == 0) {
                
            } else {
                System.out.println("Selection not available. Please try again.");
            }
        }while(selection != 0);
        
    
    }
}
