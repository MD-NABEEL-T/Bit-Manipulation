public class getBitPractice
{
    public static void main(String []args)
    {
        // Get bit example
        // binary value 0f one is 0001
        int n = 5;//0101
        int pos=3;//4321 this is how position works in bits
        int bitMask = 1<<pos;

        if((bitMask & n)==0)
        {
            System.out.println("bit was zero");
        }
        else
        {
            System.out.println("bit was one");
        }
    }
}
// refer java notes