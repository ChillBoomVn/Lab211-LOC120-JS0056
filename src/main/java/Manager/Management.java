/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Object.HistorySalary;
import java.util.Scanner;
import Object.worker;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */

public class Management {
private static Scanner sc = new Scanner(System.in);
private List<worker> wlist;
private List<HistorySalary> saList;
final double epsi = 0.0001;
    public Management() {
        wlist = new ArrayList<>();
        saList = new ArrayList<>();
    }

    
    public void AddWorker(){
        
       String id,name,workLocation;
       int age;
       double salary;
       
       id = Validation.getCode("Enter worker id: ", "Id should be not exist and not null ", wlist, 1);
        System.out.print("Enter worker name: ");
       
        name = sc.nextLine();
       
        age = Validation.getInt("Enter age worker: ",18, 50);
        
        salary = Validation.getDouble("Enter woker salary: ", epsi,Double.MAX_VALUE);
        
        System.out.print("Enter workLocation: ");
        workLocation = sc.nextLine();
        
         wlist.add(new worker(id, name, age, salary, workLocation));
        
            
    }
    
    public void UpdateWorker(int mode){
          if (wlist.isEmpty()) {
            System.err.println("List empty.");
            return;
          }
        String id = Validation.getCode("Enter worker id to be update: ","NOT found ID in Database", wlist, 2);
        double update = 0;
        double money = Validation.getDouble("Amount of money: ",epsi,Double.MAX_VALUE);
         worker o = Validation.getWorker(id, wlist);
         String status = "";
         if(mode==1){
             update = o.getSalary()+money;
             status = "UP";
         }
         else if(mode == 2){
            if(o.getSalary()>0){
              update = o.getSalary()-money;
                 status = "DOWN";
            }
         }
        o.setSalary(update);
          saList.add(new HistorySalary(id,o.getName(), o.getSalary(), o.getAge(), status,java.time.LocalDate.now()));
        }
    
    public void getInformation(){
        display(saList);
        
    }
    public void Displayall(){
        display(wlist);
    }
    
    public void display(List list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
