import java.util.Scanner;

public class HackerrankChallengeTwo {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.println();
        n = input.nextInt();
        if (n >= 0 && n <= 100) {
            if (((n >= 6 && n <= 20) && (n % 2 == 0)) || (n % 2 == 1)) {
                ;
                System.out.println("Weird");
            } else
                System.out.println("Not Weird");
        }
    }
}