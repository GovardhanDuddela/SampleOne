package abstractchallange;

public class ArtObject extends ProductForSale{
    public ArtObject(String type, double prize, String description) {
        super(type, prize, description);
    }

    @Override
    public void showDetails() {
        System.out.println("this"+type+"is beautiful reproduction");
        System.out.printf("the prize of the piece",prize);
        System.out.println(description);
    }
}
