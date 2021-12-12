import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int num = scan.nextInt();
            System.out.println(isPrime(num));
            System.out.println(isArmStrong(num));
        }
    }

    // find the prime number
    static boolean isPrime(int num) {
        return false;
    }

    // print all the three digits armstrong number;
    public static boolean isArmStrong(int num) {
        int original = num;
        int sum = 0;
        while(num > 0){
        int rem = num % 10;
        int cube = rem * rem * rem;
        sum += cube; 
        num = num / 10;
    }
    return sum == original;
    }
}
