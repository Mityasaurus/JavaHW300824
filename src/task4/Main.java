package task4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = random.ints(0, 100).limit(100).toArray();
        Arrays.stream(ints).forEach(System.out::println);
        //
        System.out.println(Arrays.stream(ints).count());
        //
        System.out.println("Even numbers: " + Arrays.stream(ints).filter(n -> n % 2 == 0).count());
        System.out.println("Odd numbers: " + Arrays.stream(ints).filter(n -> n % 2 != 0).count());
        //
        System.out.println("Min: " + Arrays.stream(ints).min().getAsInt());
        System.out.println("Max: " + Arrays.stream(ints).max().getAsInt());
        //
        System.out.println("Average: " + Arrays.stream(ints).average().getAsDouble());
        System.out.println("Sum: " + Arrays.stream(ints).sum());
        //
        System.out.println(Arrays.toString(Arrays.stream(ints).skip(30).limit(30).toArray()));
    }
}
