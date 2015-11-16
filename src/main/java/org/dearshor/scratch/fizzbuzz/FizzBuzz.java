package org.dearshor.scratch.fizzbuzz;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by dearshor on 15/11/17.
 */
public class FizzBuzz {

    public List<Object> create() {
        List<String> fizzBuzz = new LinkedList<String>();

        for (int i = 1; i <= 100; i++) {
            fizzBuzz.add(String.valueOf(i));
        }

        Object[] result = fizzBuzz.stream().flatMap(new Function<String, Stream<?>>() {
            @Override
            public Stream<?> apply(String s) {
                if (Integer.valueOf(s) % 3 == 0 && Integer.valueOf(s) % 5 == 0) {
                    return Stream.of("FizzBuzz");
                } else if (Integer.valueOf(s) % 3 == 0) {
                    return Stream.of("Fizz");
                } else if (Integer.valueOf(s) % 5 == 0) {
                    return Stream.of("Buzz");
                }
                return Stream.of(s);
            }
        }).toArray();

        return Arrays.asList(result);
    }

}
