/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch_package;

/**
 *
 * @author kamal
 */
public class Student implements Person {
    
    private String name;
    private String major;
    private double avg;

    public Student(String name, String major, double avg) {
        this.name = name;
        this.major = major;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", major=" + major + ", avg=" + avg + '}';
    }
    
    
    
    
}
