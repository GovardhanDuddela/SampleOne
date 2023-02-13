package abstractchallange;

public abstract class ProductForSale {
    protected String type;
    protected  double prize;
    protected String description;

    public ProductForSale(String type, double prize, String description) {
        this.type = type;
        this.prize = prize;
        this.description = description;
    }

    public void printPricedItem(int quantity){
        System.out.printf("%2d qty at $%8.2f each,%-15s %-35s %n",quantity,prize,type,description);
    }

    public double getSalesPrice(double quantity)
    {

        return quantity*prize;
    }
    public abstract void showDetails();

}
