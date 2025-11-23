// main class
public class OnlineStore {
    public static void main(String[] args){
        Product[] products = new Product[3];
        products[0] = new Product("A001", "Generic Product", 12.00, 25);
        products[1] = new BookProduct("BP001", "Java OOP", 35.20, 15, "Ola Pope", "7327636");
        products[2] = new ElectronicProduct("EP001", "Macbook Pro", 250.15, 54, "Apple", 30);

        System.out.println(">> Products in Catalogue...  ");
        for (Product p : products){
            p.displayProductInfo();
            System.out.println("Product Price: $" + String.format("%.2f", p.getPrice()));
            System.out.println("10% Discount Price: $" + String.format("%.2f", p.calculateDiscountedPrice(10.0)));
            System.out.println("----------------");
        }

        System.out.println("\n>> Some Product Details ");
        BookProduct bookProduct = (BookProduct) products[1]; // down casting
        System.out.println("Author of " + bookProduct.getName() + " is: " + bookProduct.getAuthor());

        ElectronicProduct electronicProduct = (ElectronicProduct) products[2];
        System.out.println(electronicProduct.getBrand() + " is the brand name of " + electronicProduct.getName());

        // discount prototypes




    }
}
