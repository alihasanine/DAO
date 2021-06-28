package lab2;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class NumberStream {
    public static void main(String[] args) {

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        IntStream sortedValues = IntStream.of(values).sorted();

        double median = (values.length%2 ==0)?(sortedValues.skip(values.length/2 -1).limit(2).average().getAsDouble())
                :(sortedValues.skip(values.length%2).findFirst().getAsInt());

        double firstQ = (values.length%4 == 0) ? (IntStream.of(values).sorted().skip((values.length%4) -1).limit(2).average().getAsDouble())
                : (IntStream.of(values).sorted().skip(values.length%4).findFirst().getAsInt());

        double thirdQ = (values.length%4 == 0) ? (IntStream.of(values).sorted().skip(((values.length%4)*3)-1).limit(2).average().getAsDouble())
                : (IntStream.of(values).sorted().skip(((values.length%4)*3)).findFirst().getAsInt() );

        System.out.println("Sorted Data " + IntStream.of(values).sorted().toArray());
        System.out.println("Median " + median);
        System.out.println("First Quartile" + firstQ);
        System.out.println("Third Quartile " + thirdQ);
    }
}
