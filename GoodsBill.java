
package Bill;

public class GoodsBill extends Bill {
    private static long count;
    

    public GoodsBill(Customer cust, double totalPrice, double promoPrice) {
        super(cust, totalPrice, promoPrice);
    }

    
    public long getNumofBill(){
        return count;
    }
    
}
     
     

