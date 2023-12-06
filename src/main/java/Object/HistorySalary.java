/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author User
 */
public class HistorySalary {

    private String id, name, status;
    private double updatesalary;
    private int age;
    private LocalDate date;

    public HistorySalary() {

    }

    public HistorySalary(String id, String name, double updatesalary, int age, String status, LocalDate date) {
        this.id = id;
        this.name = name;
        
        this.updatesalary = updatesalary;
        this.age = age;
        this.status = status;
        this.date = date;
    }
    

    public String getid() {
        return id;
    }

    public void setCode(String code) {
        this.id = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getUpdatesalary() {
        return updatesalary;
    }

    public void setUpdatesalary(double updatesalary) {
        this.updatesalary = updatesalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s | %-8s | %2d | %-7.1f | %-4s | %-10s", id,name,age,updatesalary,status,date);
        
    }

}
