package excersice2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Items {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean f = true;
        List<Bean> al = new ArrayList<Bean>();
        while (f) {
            System.out.println("Enter the details of items:");
            Bean bobj = new Bean();
            System.out.println("Enter the Item id:");
            bobj.setItemId(scan.nextInt());
            System.out.println("Enter the Short Description of an item:");
            bobj.setShortDescription(scan.next());
            System.out.println("Enter the price of an item:");
            bobj.setPrice(scan.nextInt());
            System.out.println("Enter the brand of an item:");
            bobj.setBrand(scan.next());

            al.add(bobj);
            System.out.println("Do you want more items:");
            String choice = scan.next();
            switch (choice) {
                case "y":
                    f = true;
                    break;
                case "n":
                    f = false;
                    break;
                default:

                    System.out.println("Invalid character");


            }


        }

        List<Bean> list = al.stream().filter((Bean t) -> t.getBrand().startsWith("T")).
                collect(Collectors.toList());

            list.forEach((sa)->{
                System.out.println(sa.getItemId()+" " +sa.getShortDescription()+" " +sa.getPrice()+" "+sa.getBrand()+" ");
            });
        System.out.println();

        List<Bean> list1 = al.stream().sorted(Comparator.comparingInt((Bean t) -> t.getPrice()).reversed()).collect(Collectors.toList());

        list1.forEach((sa)->{
            System.out.println(sa.getItemId()+" " +sa.getShortDescription()+" " +sa.getPrice()+" "+sa.getBrand()+" ");
        });

    }
}
