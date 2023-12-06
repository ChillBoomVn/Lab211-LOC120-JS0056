/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Object.worker;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class Validation {
    // lớp kiểm tra dữ liệu đầu vào 
    private static Scanner sc = new Scanner(System.in);
    public static int getInt(String msg,int min,int max){
        // msg để hiện thị thông báo cho người dùng mình có thể thay đổi
        int n;
        while(true){
         try {
             System.out.print(msg);
             n = Integer.parseInt(sc.nextLine());
             if(min<=n&&n<=max)
                 break;
             throw new NumberFormatException();
         }
         catch(NumberFormatException ex){
             System.out.println("Please enter an interger number in range: "+min+"->"+max );
         }
        }
        return n;
    }
    public static double getDouble(String msg,double min,double max){
     double n ;
     while(true){
      try{
          System.out.println(msg);
          n = Integer.parseInt(sc.nextLine());
          if(min<= n && n<=max)
              break;
          throw new NumberFormatException();
      }
      catch(NumberFormatException ex){
           System.out.println("Please enter an real number in range: "+min+"->"+max );
        
      }
     }
     return n;
    }
    public static String getCode(String msg,String errol,List<worker> wlist, int mode){
     String s;
       while(true){
         
           System.out.print(msg);
           s = sc.nextLine();
           if(!s.toUpperCase().isEmpty()){
            if((mode==1 && getWorker(s,wlist)==null)
                    ||(mode==2 && getWorker(s, wlist)!=null))
                break;
           }
           System.err.println(errol);
          
       }
       
        return s;
    }
    public static worker getWorker (String id,List<worker> wList){
        for (worker o : wList) {
            if(o.getId().equalsIgnoreCase(id))
                return o;
        }
        return null;
    }
    
   
    }
    

