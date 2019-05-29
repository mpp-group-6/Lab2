/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpp_cours.Prob2B;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Emmanuel Cadet
 */
public class Order {
    int orderNum;
    Date orderDate;
    ArrayList<OrderLine> orderLines;
    
    public Order(int orderNumber,double price,int qt){
        orderDate=new Date();
        orderNum=orderNumber;
        orderLines=new ArrayList<>();
        orderLines.add(new OrderLine(1,this,price,qt));
    }
    
    public void addOrderLine(int lineNumber,double price,int quantity){
        OrderLine ord=new OrderLine(lineNumber,this,price,quantity);
        orderLines.add(ord);
    }
    
    public Date getOrderDate(){
        return orderDate;
    }
    
    public int getOrderNumber(){
        return orderNum;
    }
    
    public ArrayList<OrderLine> getOrderLines(){
        return orderLines;
    }
    
    @Override
    public String toString(){
        String returnedVal=orderNum+" -- "+orderDate+" -- "+orderLines;
        return returnedVal;
    }
    
    
}
