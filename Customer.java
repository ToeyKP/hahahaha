/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student Lab
 */
public class Customer {
    private long custId;
    private static long count;

    public Customer(long custId, long count) {
        this.custId = custId;
        this.count = count;
        count++;
    }

    public static long getCount() {
        return count;
    }

    public long getCustId() {
        return custId;
    }

    @Override
    public String toString() {
        return "Customer ID : " + custId;
    }
    
    
    
    
    
}
