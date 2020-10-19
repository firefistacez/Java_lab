package Constructor;
import java.util.*;
import java.lang.*;

public class ConcatenateReverse
{
    StringBuffer s1=new StringBuffer();
    StringBuffer s2=new StringBuffer();
    ConcatenateReverse()
    {
        s1.append(" ");
    }
    ConcatenateReverse(StringBuffer s1)
    {
        this.s1 = s1;
        System.out.println(s1);
    }
    ConcatenateReverse(StringBuffer s1, StringBuffer s2)
    {
        this.s1 = s1;
        this.s2 = s2;
        System.out.print("After concatenation-");
        System.out.println(s1.append(s2));
        System.out.print("Reverse-");
        System.out.println(s1.reverse());
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("String1-");
        StringBuffer string1 = new StringBuffer(scan.next());
        System.out.print("String2-");
        StringBuffer string2 = new StringBuffer(scan.next());
        ConcatenateReverse flag = new ConcatenateReverse(string1,string2);
    }
}
