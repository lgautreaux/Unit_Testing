/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        double outcome = add(2, 4);
        System.out.println(outcome == 6);
    }
    
    public static double add(double x, double y) {
        return x + y;
    }

    public static boolean IsPrime(int number) {
        if (number < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(number); ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Special(int x) {
        if (x == 2023) {
            throw new NullPointerException("Special");
        } else {
            System.out.println(x);
        }
    }
}