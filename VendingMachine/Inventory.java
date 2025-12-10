import java.util.HashMap;

public class Inventory{
    private String id;
    private HashMap <Integer, Integer> stock; // ProductId, Quantity
    // update/refill stock
    // reduce stock
    // Need to Mock the stock with sample quantity
    Inventory(){
        this.stock = new HashMap<>();
        mockStock();
    }
    public Boolean updateStock(int productId, int quantity){ // add or delete
        Integer currentStock = stock.get(productId);
        Integer finalStock = currentStock + quantity;
        if(finalStock < 0) return false;
        stock.put(productId, finalStock);
        return true;
    }
    private void mockStock(){
        for(int i=1;i<=10;i++){
            this.stock.put(i,10);
        }
    }
    public int getStock(int productId){
        return stock.getOrDefault(productId,0);
    }
    public Boolean isAvailable(int productId){
        return stock.getOrDefault(productId,0)>0;
    }
}