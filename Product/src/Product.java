// Base class - implementing encapsulation
public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantityInStock;

    // constructor
    public Product(String productId, String name, double price, int quantityInStock){
        setProductId(productId);
        setName(name);
        setPrice(price);
        setQuantityInStock(quantityInStock);
    }

    // the getters
    public String getProductId(){ return productId; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }
    public int getQuantityInStock(){ return quantityInStock; }

    // the setters with validation
    public void setProductId(String productId){
        if (productId != null && !productId.trim().isEmpty()){
            this.productId = productId;
        } else {
            System.out.println("Invalid Product ID!");
        }
    }

    public void setName(String name){
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        } else {
            System.out.println("Invalid Product name!");
        }
    }

    public void setPrice(double price){
        if (price >= 0){
            this.price = price;
        } else {
            System.out.println("Price cannot be negative");
        }
    }

    public void setQuantityInStock(int quantityInStock){
        if (quantityInStock >= 0){
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("Quantity cannot be negative");
        }
    }

    // methods - general behaviour
    public void displayProductInfo(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name" + name);
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("Quantity in Stock: " + quantityInStock);
    }

    // method - to be overridden - polymorphism
    public double calculateDiscountedPrice(double discountedPercentage){
        if (discountedPercentage < 0 || discountedPercentage > 100){
            System.out.println("Invalid discount percentage");
            return price;
        }
        return price * (1 - (discountedPercentage / 100));
    }
}
