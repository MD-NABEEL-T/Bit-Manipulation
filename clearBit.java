public class clearBit
{
    public static void main(String []args)
    {
        // binary value 0f one is 0001
        // 1<<2 =0001 we are moving 2 positions =>0100
        // not operator = 0100 = 1011
        // And operation 1011 & 0101 =>0001
        int n= 5;//0101
        int pos =2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
