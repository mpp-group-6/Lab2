/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpp_cours.Prob2B;

/**
 *
 * @author Emmanuel Cadet
 */
public class OrderLine {
    int lineNum;
    double price;
    int quantity;
    Order order;
    
    OrderLine(int lineNumber,Order ord,double price,int qt){
        lineNum=lineNumber;
        this.price=price;
        quantity=qt;
        order=ord;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public void setQuantity(int qt){
        quantity=qt;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public Order getOrder(){
        return order;
    }
    
    @Override
    public String toString(){
        String returnedVal="["+getOrder().getOrderNumber()+" : "+lineNum+","+price+","+quantity+"]";
        return returnedVal;
    }
    
}
