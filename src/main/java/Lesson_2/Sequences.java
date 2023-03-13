package Lesson_2;

interface SequenceGenerator {
    void a(int var1);

    void b(int var1);

    void c(int var1);

    void d(int var1);

    void e(int var1);

    void f(int var1);

    void g(int var1);

    void h(int var1);

    void i(int var1);

    void j(int var1);
}

public class Sequences {

    public static void main(String[] args) {
        SequenceGenerator test = new SequencesImpl();
        test.a(5);
        test.b(5);
        test.c(5);
        test.d(5);
        test.e(5);
        test.f(5);
        test.g(5);
        test.h(5);
        test.i(5);
        test.j(5);
    }
}

class SequencesImpl implements SequenceGenerator {
    int result;

    public void a(int n) {
        System.out.print("A: ");

        for (int i = 1; i < n + 1; ++i) {
            this.result = 2 * i;
            System.out.print(this.result + " ");
        }

        System.out.println();
    }

    public void b(int n) {
        System.out.print("B: ");
        this.result = 1;

        for (int i = 1; i < n + 1; ++i) {
            System.out.print(this.result + " ");
            this.result += 2;
        }

        System.out.println();
    }

    public void c(int n) {
        System.out.print("C: ");

        for (int i = 1; i < n + 1; ++i) {
            this.result = (int) Math.pow(i, 2.0);
            System.out.print(this.result + " ");
        }

        System.out.println();
    }

    public void d(int n) {
        System.out.print("D: ");

        for (int i = 1; i < n + 1; ++i) {
            this.result = (int) Math.pow(i, 3.0);
            System.out.print(this.result + " ");
        }

        System.out.println();
    }

    public void e(int n) {
        System.out.print("E: ");

        for (int i = 1; i < n + 1; ++i) {
            this.result = 1;
            if (i % 2 == 0) {
                this.result *= -1;
                System.out.print(this.result + " ");
            } else {
                System.out.print(this.result + " ");
            }
        }

        System.out.println();
    }

    public void f(int n) {
        System.out.print("F: ");

        for (int i = 1; i < n + 1; ++i) {
            this.result = i;
            if (i % 2 == 0) {
                this.result *= -1;
                System.out.print(this.result + " ");
            } else {
                System.out.print(this.result + " ");
            }
        }

        System.out.println();
    }

    public void g(int n) {
        System.out.print("G: ");

        for (int i = 1; i < n + 1; ++i) {
            this.result = (int) Math.pow(i, 2.0);
            if (i % 2 == 0) {
                this.result *= -1;
                System.out.print(this.result + " ");
            } else {
                System.out.print(this.result + " ");
            }
        }

        System.out.println();
    }

    public void h(int n) {
        System.out.print("H: ");

        for (int i = 1; i < n + 1; ++i) {
            this.result = i;
            if (i % 2 == 0) {
                this.result = 0;
                System.out.print(this.result + " ");
            } else {
                System.out.print(this.result + " ");
            }
        }

        System.out.println();
    }

    public void i(int n) {
        System.out.print("I: ");
        this.result = 1;

        for (int i = 1; i < n + 1; ++i) {
            this.result *= i;
            System.out.print(this.result + " ");
        }

        System.out.println();
    }

    public void j(int n) {
        System.out.print("J: ");
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;

        int i;
        for (i = 2; i < n; ++i) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for (i = 0; i < n; ++i) {
            System.out.print(fibo[i] + " ");
        }

        System.out.println();
    }
}