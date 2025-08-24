public class setBitPractice
{
    public static void main(String []args)
    {
        
        // Get bit example
        int n = 5;//0101
        // here we are inserting 1 as 0111 and making it 7 ok
        int pos=1;//4321 this is how position works in bits
        //0001 => 1<<1 =0010
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;//0010 | 0101 => 0111 =7
        System.out.println(newNumber);
    }
}
// refer java notes