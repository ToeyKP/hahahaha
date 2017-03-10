/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student Lab
 */
public class Foodbill extends bill {
    private static long count;
    
    public Foodbill(Customer cust,double price){
        super(cust,price);
        count++;
    }

    public static long getNumOfbill() {
        return count;
    }

    @Override
    public String toString() {
        return "Foodbill{" + '}';
    }
    
    
    
}
