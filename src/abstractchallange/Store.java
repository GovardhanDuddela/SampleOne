package abstractchallange;

import java.util.ArrayList;
record OrderItem(int quantity,ProductForSale product){}

public class Store {
    private static ArrayList<ProductForSale> pr=new ArrayList<>();

    public static void main(String[] args) {
        pr.add(new ArtObject("water",10,"drinking water"));
        pr.add(new ArtObject("WHEAT",20,"CHAPATHI"));
        pr.add(new Furniture("desk",500,"bed"));
        pr.add(new Furniture("TEKU",1000,"DOORS"));
        listProducts();
        System.out.println("\n order1");
        var order1=new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);
        System.out.println("\n order2");
        var order2=new ArrayList<OrderItem>();
        addItemToOrder(order2,3,5);
        printOrder(order2);
    }
    public static void listProducts(){
        for(var item:pr){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex,int qty){
        order.add(new OrderItem(qty,pr.get(orderIndex)));

    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal=0;
        for(var item:order){
            item.product().printPricedItem(item.quantity());
            salesTotal+=item.product().getSalesPrice(item.quantity());
        }
        System.out.println("sales total ="+salesTotal);
    }
}
