package Exception;

import java.util.Scanner;

public class ExceptionThrown {

    static int computeDivision(int a, int b) {

        int res;
        res = a/b;
        return res;
    }

    static void return7Element(int[] array) {
        try{
            System.out.println("The seventh element of the given array is " + array[6]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array has less than 7 elements");
        }
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] list = {1,2,3,4};
        try
        {
            return7Element(array);
            return7Element(list);
            System.out.println("Enter two numbers:");
            String a = scan.next();
            String b = scan.next();
            System.out.println("Answer : " + computeDivision(Integer.parseInt(a),Integer.parseInt(b)));
        }

        catch (NumberFormatException ne) {
            System.out.println("Enter a number");
        }

        catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
