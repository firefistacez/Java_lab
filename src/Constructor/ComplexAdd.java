package Constructor;
import java.util.*;
import java.lang.*;

class ComplexNumber
{
    int real_part;
    int imaginary_part;
    ComplexNumber(){}
    ComplexNumber(int real_part, int imaginary_part) {
        this.real_part = real_part;
        this.imaginary_part = imaginary_part;
    }
    public void toComplex(StringBuffer s1) {
        int plus = s1.indexOf("+");
        String rl_part = s1.substring(0,plus);
        int imag = s1.indexOf("i");
        String imag_part = s1.substring(plus,imag);
        real_part= Integer.parseInt(rl_part);
        imaginary_part = Integer.parseInt(imag_part);
    }
    public void addComplex(int r1, int i1, int r2, int i2) {
        real_part = r1+r2;
        imaginary_part = i1+i2;
    }
}

class ComplexAdd
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Complex Number1- ");
        StringBuffer s1 = new StringBuffer(scan.next());
        ComplexNumber cNumber1 = new ComplexNumber();
        cNumber1.toComplex(s1);
        System.out.print("Complex Number2- ");
        StringBuffer s2 = new StringBuffer(scan.next());
        ComplexNumber cNumber2 = new ComplexNumber();
        cNumber2.toComplex(s2);
        ComplexNumber cNumber3 = new ComplexNumber();
        cNumber3.addComplex(cNumber1.real_part, cNumber1.imaginary_part, cNumber2.real_part, cNumber2.imaginary_part);
        System.out.println("Sum of two Complex number is = " + cNumber3.real_part + "+" + cNumber3.imaginary_part + "i");
    }
}
