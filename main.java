import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 100;

        int rand = (int)(Math.random() * (max-min+1)+min);
        int guess = 0;

        while (true) {
            int num = input.nextInt();

            if (num < rand) {
                guess += 1;
                System.out.println("too low");
            } else if (num > rand) {
                guess ++;
                System.out.println("too high");
            } else {
                System.out.println("hurray, you guessed it correct!");
                System.out.println("you guessed it in these guesses: "+guess);
                break;
            }
        }
    }
}