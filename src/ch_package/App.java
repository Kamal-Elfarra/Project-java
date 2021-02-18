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
public class App {
    
    public static void main(String[] args){
        
        double data[]={15.2,4.30,40.66};
//            show(data);
            
            Person p[]={
                
                new Student("kamal", "comp.sc", 88),
                new employee("wael", "sales", 100),
                new Student("salem", "SE", 90.3)

                
            };
            
            for(Person s:p){
                
                System.out.println("all the name is : "+s);
                
            }
            
            
        }
    
    public static void show(double data[]){
        
        for(double d:data)
            System.out.println(d);
        
    }
        
}
    
 