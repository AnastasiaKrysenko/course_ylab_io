import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(100);
        int maxAttempts = 10;
        System.out.println("Я загадал число от 1 до 99. У тебя " + maxAttempts + " попыток угадать.");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            counter++;
            int input = scanner.nextInt();
            if (number > input) {
                System.out.println("Мое число больше! У тебя осталось " + (9-i) + " попыток");
            } else if (number < input) {
                System.out.println("Мое число меньше! У тебя осталось " + (9-i) + " попыток");
            } else {
                System.out.println("Ты угадал с " + (i+1) + " попытки");
                break;
            }
        }
        if (counter > 9)
            System.out.println("Ты не угадал");
        }
    }



