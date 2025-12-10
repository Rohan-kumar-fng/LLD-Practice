public class MachineController{
    // Take the Product Request
    // Check the availability
    // start with payment process
    // if successful, dispense
    // update the Stock
    
    // Capture the Product ORder
    // I think this only have functions, no data attributes is needed here
    private Inventory inventory;
    private Payment payment;
    MachineController(){
        this.inventory = new Inventory();
        this.payment = new Payment();
    }

    // Let's say user want to purchage this product, So I already know the name, id and price of the product

    public Product acceptOrder(){
        Product p = new Product();
        p.setId(10);
        p.setName("Coca Cola");
        p.setPrice(20.0);
        return p;
    }

    // At the start I have to intilize the inventory object to use here.
    public void start(){
        try{
            // Let me mock the stock Map
            Product p = acceptOrder();

            if(!inventory.isAvailable(p.getId())){
                throw new Exception("Product is Out of Stock");
            }

            String modeOfPayment = "Cash";
            Double cashInserted = 20.0;

            payment.processPayment(p,modeOfPayment,cashInserted);

            if(!payment.isPaymentCompleted()){
                throw new Exception("Payment Unsuccessful");
            }

            inventory.updateStock(p.getId(),-1);
            System.out.println("Payment Successfull & Product Dispensed");

        } catch(Exception e){
            System.out.println("Error Occured: " + e);
        }
    }

}