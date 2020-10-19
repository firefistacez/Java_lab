package Armstrong;
import java.io.*;
import java.lang.Math;
public class ArmstrongBuff
{
    public static int no_digits(int num)
    {
        int temp = num;
        int count=0;
        while(num > 0)
        {
            temp = temp%10;
            count+=1;
            num = (int)num/10;
        }
        return count;
    }
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the number to check: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int count = no_digits(number);
        int sum=0,digit=0, temp=number;
        while(number>0)
        {
            digit = number%10;
            sum = sum + (int)Math.pow(digit,count);
            number = (int)number/10;
        }
        if(sum==temp)
        {
            System.out.println(temp + " is an Armstrong number.");
        }
        else
        {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
