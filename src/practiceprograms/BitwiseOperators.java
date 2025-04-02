package practiceprograms;

public class BitwiseOperators {
    public static void main(String[] args){
        int a=5, b=3;
        //8421
        //0101 <- 5
        //0011 <- 3

        System.out.println("a & b: "+ (a & b)); //bitwise AND =1
        System.out.println("a | b: "+ (a | b)); //bitwise OR =7
        System.out.println("a ^ b: "+ (a ^ b)); //bitwise XOR=6 -> if bits are same , result bit is 1, if bits diff, result bit is 0.
        System.out.println("~a: "+ (~a));// Inverts the bits: ans=-6: a= 0101 -> (~a)invert the bits-> 1010 ->Since leftmost bit is negative, take 2's complement->Invert the bits-> 0101-> Add 1 ->0110-> -6
        System.out.println("a << 1: "+ (a << 1)); //Left shift -> Multiply by 2
        System.out.println("a >> 1: "+ (a >> 1)); //Right Shift=2 -> Divide by 2 : 5/2=2(quotient)
        System.out.println("a >>> 1: "+ (a >>> 1));// Unsigned right shift
    }
}
