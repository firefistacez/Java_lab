package Interface;
import java.util.*;

public class InterfaceStack{
    public static void main(String[] args) {
        StackWith stackw = new StackWith(5);
        StackWithout stackwout = new StackWithout(5);
        Scanner scan = new Scanner(System.in);
        int item;
        System.out.println("With constraints");
        System.out.print("Enter the elements to be inserted: ");
        for(int i=0;i<5;i++) {
            item = scan.nextInt();
            stackw.push(item);
        }

        System.out.print("Pop: ");
        for(int i=0;i<5;i++) {
            System.out.print(stackw.pop() + " ");
        }

        System.out.println();
        System.out.println("Without constraints");
        System.out.print("Enter the elements to be inserted: ");
        item = scan.nextInt();
        stackwout.push(item);
        System.out.println("Enter 0 to exit: ");
        int option = scan.nextInt();
        while(option != 0) {
            System.out.print("Next element: ");
            item = scan.nextInt();
            stackwout.push(item);
            System.out.println("Enter 0 to exit: ");
            option = scan.nextInt();
        }
        System.out.print("Pop:");
        int p;
        for(int i=0;i<5;i++) {
            p = stackwout.pop();
            if(p != 0){
                System.out.print(p + " ");
            }
        }
    }
}
