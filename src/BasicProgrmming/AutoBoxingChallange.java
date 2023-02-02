package BasicProgrmming;

import java.util.ArrayList;
record Customer(String name,ArrayList<Double> transcations){
    public Customer(String name,double initialdeposit){
        this(name.toUpperCase(),new ArrayList<Double>(500));
        transcations.add(initialdeposit);

    }
}

public class AutoBoxingChallange {
    public static void main(String[] args) {
        Customer gova=new Customer("gova",999);
        System.out.println(gova);
        
    }
}
