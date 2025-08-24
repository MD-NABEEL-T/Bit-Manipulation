import java.util.*;
public class clearBit
{
    public static void main(String []args)
    {
        // for 0 and with not used //refer clear operation concept
        // for 1 or //refer set operation concept 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation (1 = set, 0 = clear):");
        int operation = sc.nextInt();
        int n= 5;//0101 =>0111= 7
        int pos =1;
        int bitMask = 1 << pos;
        //update bit to 1 else update bit to 0
    if(operation == 1)
    {
        // set operation
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
    else
    {
        // clear
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
    }
    }
}
