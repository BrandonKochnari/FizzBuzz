package lab1;

public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            boolean multiples_of_3 = i % 3 == 0;
            boolean multiples_of_5 = i % 5 == 0;

            if (multiples_of_3 || multiples_of_5) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
