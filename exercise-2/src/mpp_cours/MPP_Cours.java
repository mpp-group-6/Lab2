/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpp_cours;
import mpp_cours.Prob2A.*;
import mpp_cours.Prob2B.*;

/**
 *
 * @author Emmanuel Cadet
 */
public class MPP_Cours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //===================Prob2 A (Tests)=================//
        Student stud1=new Student("Jean");
        GradeReport grad1=stud1.getGradeReport();            
        grad1.setGrade("A");     
        //------It is impossible to create a GradeReport object using the code below
            ////*******GradeReport grad2=new GradeReport(stud1);
        
        //----Printing the sutdent object
        System.out.println(stud1);
        
        
        //==================Prob2 B (Tests)==================//
        Order order1=new Order(1,25.50,2);
        order1.addOrderLine(2,30.00,1);
        order1.addOrderLine(3,20.00,3);
        //----It is not possible to create an order with the code below---//
            /////******OrderLine ordLine1=new OrderLine(1,order1);  
            
        
        //----To create an order we have to use the owner of it which is the order1 Object
        OrderLine ordLine1=order1.getOrderLines().get(0);
        OrderLine ordLine2=order1.getOrderLines().get(1);
        
        //---Printing the two orderLines
        System.out.println(ordLine1);
        System.out.println(ordLine2);
        
        //---Printing the order
        System.out.println(order1);
        
        
    }
    
}
