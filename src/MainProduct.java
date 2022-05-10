public class MainProduct {

    public static void main(String[] args) {
        Product prod1 = new Product(4, 10,"Gallon of gas");
        prod1.printProduct();
        prod1.totalCost();
        Product prod2 = new Product(3, 5,"Dozen of egg");
        prod2.printProduct();
        prod2.totalCost();
        

    }

}
