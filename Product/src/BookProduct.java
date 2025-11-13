// subclass - implementing inheritance and polymorphism
public class BookProduct extends Product{
    private String author;
    private String isbn;

    public BookProduct(String productId, String name, double price, int quantityInStock, String author, String isbn){
        super(productId, name, price, quantityInStock);
        this.author = author;
        this.isbn = isbn;
    }

    // the getters for book features
    public String getAuthor(){ return author; }
    public String getIsbn(){ return isbn; }

    // the setters with validations
    public void setAuthor(String author){
        if (author != null && !author.trim().isEmpty()){
            this.author = author;
        } else {
            System.out.println("Invalid Author Name!");
        }
    }

    public void setIsbn(String isbn){
        if (isbn != null && !isbn.trim().isEmpty()){
            this.isbn = isbn;
        } else {
            System.out.println("Invalid ISBN!");
        }
    }

    @Override
    public void displayProductInfo(){
        super.displayProductInfo();
        System.out.println("Author Name: "+ author);
        System.out.println("ISBN Number: "+ isbn);
    }

    @Override
    public double calculateDiscountedPrice(double discountPercentage){
        System.out.println("Special Book Discount..");
        double baseDiscountPrice = super.calculateDiscountedPrice(discountPercentage);
        return baseDiscountPrice * (1 -(5.0 / 100)); // extra 5% discount
    }

}
