package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            boolean multiples_of_a = i % a == 0;
            boolean multiples_of_b = i % b == 0;

            if (multiples_of_a || multiples_of_b) {
                counter++;
            }
        }
        return counter;
    }
    public static int multiples() {
        return multiples(1000,3,5);
    }
}
