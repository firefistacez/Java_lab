package Package.Pack2;
import Package.Pack1.PurchaseOrder;
import java.util.Scanner;
public class RegularCustomer implements PurchaseOrder{
    String customerID;
    String customerName;
    String customerAddress;
    String[] itemsOrdered = {" "};
    int[] numberOfEachItem = new int[1];

    public void get_setInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the customer id: ");
        String cusID = "RC" + scan.next();
        System.out.print("Enter the customer name: ");
        String cusName = "";
        cusName = scan.nextLine();
        cusName += scan.nextLine();
        System.out.print("Enter the customer address: ");
        String cusAddress = scan.nextLine();
        setInfo(cusID, cusName, cusAddress);
    }

    public void setInfo(String cusID, String cusName, String cusAddress){
        customerID = cusID;
        customerName = cusName;
        customerAddress = cusAddress;
    }

    public int arrayContains(String itemName){
        for(int i=0;i<itemsOrdered.length;i++){
            if(itemsOrdered[i].equals(itemName)){return i;}
        }
        return -1;
    }

    public void addItems(String itemName, int index){
        int m = arrayContains(itemName);
        if(m != -1){
            numberOfEachItem[m] += 1;
        }
        else{
            if(index==1){itemsOrdered[0] = itemName; numberOfEachItem[0] = 1;}
            else{
                int n = itemsOrdered.length;
                String[] newArr = new String[n + 1];
                int[] newArray = new int[n+1];
                for(int i=0;i<n;i++){
                    newArr[i] = itemsOrdered[i];
                    newArray[i] = numberOfEachItem[i];
                }
                newArr[n] = itemName;
                newArray[n] = 1;
                itemsOrdered = new String[n+1];
                numberOfEachItem = new int[n+1];
                for(int i=0;i<n+1;i++){
                    itemsOrdered[i] = newArr[i];
                    numberOfEachItem[i] = newArray[i];
                }
            }
        }
    }

    public void displayCustomerInfo(){
        System.out.println("Customer Information: ");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        for(int i=0;i<itemsOrdered.length;i++){
            System.out.println(itemsOrdered[i] + " - " + numberOfEachItem[i]);
        }
    }

    public int discount(int total){
        int discountAmount = (15/100)*total;
        total = total - discountAmount;
        return total;
    }
}