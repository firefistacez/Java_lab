package Armstrong;

import java.util.*;
public class ArmstrongThree
{
    public static void main(String[] args)
    {
        int num;
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int sum = 0;
        int digit = 0;
        int temp = num;
        while(num>0)
        {
            digit = num%10;
            sum = sum + (digit*digit*digit);
            num = (int)num/10;
        }
        if(sum == temp)
        {
            System.out.println(temp + " is an Armstrong number");
        }
        else
        {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}