package ulam2;

public class Main {
    public static void main(String[] args) {
        int side = 11;
        int x = 5;
        int y = 5;
        int[][] field = new int[side][side];
        field[y][x] = 1;
        int counter = 1;

        for (int i = 1; i < side; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    ++counter;
                    --y;
                    if (isPrime(counter)) field[y][x] = 0;
                    else field[y][x] = counter;
                }
                for (int j = 0; j < i; j++) {
                    ++counter;
                    ++x;
                    if (isPrime(counter)) field[y][x] = 0;
                    else field[y][x] = counter;
                }
            }
            else {
                for (int j = 0; j < i; j++) {
                    ++counter;
                    ++y;
                    if (isPrime(counter)) field[y][x] = 0;
                    else field[y][x] = counter;
                }
                for (int j = 0; j < i; j++) {
                    ++counter;
                    --x;
                    if (isPrime(counter)) field[y][x] = 0;
                    else field[y][x] = counter;
                }

                }
            }

        for (int i = 1; i < side; i++) {
            ++counter;
            --y;
            if (isPrime(counter)) field[y][x] = 0;
            else field[y][x] = counter;
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

    }

    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
            else continue;
        }
        return true;
    }
}
