package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name,String type,int count){
    public GroceryItem(String name){
       this(name,"DAIRY",1);
    }
}
public class AArrayList {
    public static void main(String[] args) {
        Object[] groceryArray=new Object[3];
        groceryArray[0]=new GroceryItem("milk");
        groceryArray[1]=new GroceryItem("DAL","EATING",2);
        groceryArray[2]=new GroceryItem("GOLD","JWELLERY",9);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectlist=new ArrayList();
        objectlist.add(new GroceryItem("Kija"));

        ArrayList<GroceryItem> groceryItems= new ArrayList<>();
        groceryItems.add(new GroceryItem("butter"));
        System.out.println(groceryItems);
    }

}
