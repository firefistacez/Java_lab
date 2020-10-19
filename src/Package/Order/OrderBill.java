package Package.Order;
import java.util.*;

import Package.Pack2.RegularCustomer;
import Package.Pack3.SeasonalCustomer;

public class OrderBill{
    static String[] items = {"Cricket Bat", "Football", "Football shoes", "Cricket Kit", "Badminton racket", "Tennis Shoes"};
    static int[] priceItems = {2700, 3500, 6700, 18000, 2500, 5600};

    public static void displayItems(){
        int i=1;
        for(String item: items){
            System.out.println(i + " " + item);
            i++;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int end=1, orderNum=0, total=0;
        System.out.print("Are you a regular customer or seasonal customer: ");
        String customer = scan.nextLine();
        if(customer.equals("regular customer")){
            RegularCustomer rCustomer = new RegularCustomer();
            rCustomer.get_setInfo();
            displayItems();
            while(end!=0){
                System.out.print("Enter the item number of your order: ");
                orderNum = scan.nextInt();
                try{
                    rCustomer.addItems(items[orderNum-1],orderNum);
                    total += priceItems[orderNum-1];
                }
                catch(ArrayIndexOutOfBoundsException ae){
                    System.out.println("Enter a number within range");
                }
                System.out.print("Enter 0 to exit: ");
                end = scan.nextInt();
            }
            System.out.println("");
            rCustomer.displayCustomerInfo();
            System.out.println("Total bill amount: " + rCustomer.discount(total));
        }
        else if(customer.equals("seasonal customer")){
            SeasonalCustomer sCustomer = new SeasonalCustomer();
            sCustomer.get_setInfo();
            displayItems();
            while(end!=0){
                System.out.print("Enter the item number of your order: ");
                orderNum = scan.nextInt();
                try{
                    sCustomer.addItems(items[orderNum-1],orderNum);
                    total += priceItems[orderNum-1];
                }
                catch(ArrayIndexOutOfBoundsException ae){
                    System.out.println("Enter a number within range");
                }
                System.out.print("Enter 0 to exit: ");
                end = scan.nextInt();
            }
            System.out.println("");
            sCustomer.displayCustomerInfo();
            System.out.println("Total bill amount: " + sCustomer.discount(total));
        }
    }
}