/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 *
 * @author User
 */
public class worker {
    private String id;
    private String name;
    private int age;
    private double salary;
    private String worklocation;

    public worker() {
    }

    public worker(String id, String name, int age, double salary, String worklocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.worklocation = worklocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorklocation() {
        return worklocation;
    }

    public void setWorklocation(String worklocation) {
        this.worklocation = worklocation;
    }

    @Override
    public String toString() {
        return String.format("%s | %-4s | %2d | %-4f | %-10s",id,name,age,salary,worklocation);
    }
    
    
}
