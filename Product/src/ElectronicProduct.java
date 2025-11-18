// subclass - implementing inheritance and polymorphism
public class ElectronicProduct extends Product{
    private String brand;
    private int warrantyMonths;

    public ElectronicProduct(String productId, String name, double price, int quantityInStock, String brand, int warrantyMonths){
        super(productId, name, price, quantityInStock);
        this.brand = brand; // ?? or setBrand(brand);
        this.warrantyMonths = warrantyMonths; // or setWarrantyMonths(warrantyMonths)
    }

    // the getters
    public String getBrand(){ return brand; }
    public int getWarrantyMonths(){ return warrantyMonths; }

    // the setters, with validations
    public void setBrand(String brand){
        if(brand != null && !brand.trim().isEmpty()){
            this.brand = brand;
        } else {
            System.out.println("Invalid Brand Name!");
        }
    }

    public void setWarrantyMonths(int warrantyMonths){
        if(warrantyMonths >= 0){
            this.warrantyMonths = warrantyMonths;
        } else {
            System.out.println("Warranty Months is incorrect!");
        }
    }

    @Override
    public void displayProductInfo(){
        super.displayProductInfo();
        System.out.println("Brand Name: " + brand);
        System.out.println("Warranty Months: " + warrantyMonths);
    }

    @Override
    public double calculateDiscountedPrice(double discountPercentage){
        if(getPrice() > 500 && discountPercentage > 10) {
            System.out.println("Applying discount for premium electronic product.");
            return super.calculateDiscountedPrice(discountPercentage + 5);
        }
        return super.calculateDiscountedPrice(discountPercentage);
    }
}
