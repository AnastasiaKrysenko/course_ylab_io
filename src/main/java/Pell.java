import java.util.Scanner;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            if (num <= 2)
                System.out.println(num);
            int x = 1;
            int y = 2;
            int z;
            for (int i = 3; i <= num; i++) {
                z = 2 * y + x;
                x = y;
                y = z;
                if(i==num)System.out.println("The " + num + "-th" + " term of the series is: " + z);
            }
        }
    }
}

