package abstractchallange;

public class Furniture extends ProductForSale{
    public Furniture(String type, double prize, String description) {
        super(type, prize, description);
    }

    @Override
    public void showDetails() {
        System.out.println("this"+type+"is desk");
        System.out.printf("the prize of the piece",prize);
        System.out.println(description);
    }
}
