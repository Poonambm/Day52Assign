public class Product {
    private int quantity;
    private String productname;
    private double cost;

    public Product(double prodcost,int prodquantity, String prodname) {
        this.quantity = prodquantity;
        this.productname = prodname;
        this.cost = prodcost;
    }
    public void totalCost(){
        System.out.println("Total cost is "+ cost*quantity);
    }

    public void printProduct(){
        System.out.println(this.productname + " costs " + this.cost + " and "+ this.quantity+" units were purchased" );
    }
}

