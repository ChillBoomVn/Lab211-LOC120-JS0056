/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Manager.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu {
    private static String[] ops = {
       "Add Worker: ",
       "Up Salary: ",
       "Down Salary: ",
       "Display information of All",
       "Display information salary: ",
       
       "Exit"
    };
    private static int getChoice(){
      Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ops.length;  i++) {
            System.out.println((i+1)+ ". " +ops[i]);
        }
         return Validation.getInt("Your Choice:  ",1, ops.length);
    }
    public static void display(){
        Management m = new Management();
        int choice;
       
        do{
            System.out.println("========================Worker Management========================");
            choice = getChoice();
            switch(choice){
                case 1:
                     System.out.println("------------------------Add Worker------------------------");
                    m.AddWorker();
                    break;
                case 2:
                    System.out.println("------------------------Up/Down Salary------------------------");
                    m.UpdateWorker(1);
                     break;
                case 3:
                    System.out.println("------------------------Up/Down Salary------------------------");
                    m.UpdateWorker(2);
                     break;
                case 4:
                     System.out.println("------------------------Display All Information------------------------");
                     m.Displayall();
                     break;
                case 5:
                     System.out.println("------------------------Display Information Salary------------------------");
                     m.getInformation();
                    break;
                case 6:
                    break;
            }
        }
        while(choice != 6);
    
    }
}

