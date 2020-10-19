package Exception;
import java.util.*;

public class Supermarket {
    String[] items = {"Mango", "Laptop", "Shirt", "Door Mat", "Chess Set"};
    int[] orderedItems = new int[5];

    public void showItems() {
        int count = 1;
        System.out.println("Items present in this super market");
        for(String item: items) {
            System.out.println(count + ". " + item);
            count+=1;
        }
    }

    public void addItems(int index, int numberOfItems) {
        orderedItems[index] = orderedItems[index] + numberOfItems;
    }

    public void yourOrder() {
        System.out.println("Your order");
        for(int i=0;i< items.length;i++) {
            if(orderedItems[i] != 0) {
                System.out.println("You have ordered " + orderedItems[i] + " " + items[i] + "s .");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Supermarket sMarket = new Supermarket();
        String input, order;
        int index, numberOfItems, end=1;
        while(end!=0) {
            sMarket.showItems();
            System.out.print("Enter the item number you want to add: ");
            input = scan.next();
            try {
                try {
                    index = Integer.parseInt(input);
                    order = sMarket.items[index-1];
                    System.out.print("Enter the number of " + order + ": ");
                    numberOfItems = scan.nextInt();
                    sMarket.addItems(index-1, numberOfItems);
                    System.out.print("Do you want to order anything else(Yes or No):");
                    input = scan.next();
                    end = (input.equals("Yes")) ? 1 : 0;
                }
                catch (ArrayIndexOutOfBoundsException ai) {
                    System.out.println("Invalid input");
                    System.out.println("Please try again");
                }
            }   
            catch (NumberFormatException e){
                System.out.println("Enter a number");
                System.out.println("Please try again");
            }
        }
        sMarket.yourOrder();
    }
}
