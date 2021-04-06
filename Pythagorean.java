import java.lang.Math;

public class Pythagorean {
    public static double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        return Math.sqrt(legA*legA + legB*legB);
    }

    public static void main(String[] args) {
        System.out.println(calculateHypotenuse(3, 3));
        // double a = 1.11111111111111111111111111111111111;
        // float b = 1.111111111111111111111111111111111111f;
        // int c = (int) 1e100;
        // long d = (long) 1e100;
        // short e = 32767;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // e++;
        // System.out.println(e);
        // Integer i = null;
    }
    
}

