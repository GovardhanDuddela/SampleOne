package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class ChallangeArr {
    public static void main(String[] args) {
        /*ArrayList<String> items=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("please select 0,1,2 " +
                "0 for exit"+" 1 to add"+" 2 to remove");
        int a=sc.nextInt();
        if (a==0){

        } else if (a==1) {
            items.add("pen");
            items.add("paper");
            items.add("jockey underwear");
            System.out.println(items.get(2));

        }
        else if(a==2){
            items.remove("pen");
            System.out.println(items);

        }*/
        String str="javainsimpleway";
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('i', 7));
    }
}
