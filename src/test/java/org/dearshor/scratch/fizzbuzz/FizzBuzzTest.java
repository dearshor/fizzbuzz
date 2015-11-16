package org.dearshor.scratch.fizzbuzz;

import org.junit.Assert;
import org.junit.BeforeClass;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by dearshor on 15/11/17.
 */
public class FizzBuzzTest {

    private static FizzBuzz fizzBuzz;

    @BeforeClass
    public static void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @org.junit.Test
    public void testCreate() throws Exception {
        long t1 = System.currentTimeMillis();
        List<Object> results = fizzBuzz.create();

        printToConsole(results);

        Assert.assertNotNull(results);
        Assert.assertEquals(100, results.size());
        Assert.assertEquals("1", results.get(0));
        Assert.assertEquals("Fizz", results.get(2));
        Assert.assertEquals("Buzz", results.get(4));
        Assert.assertEquals("4", results.get(3));
        long t2 = System.currentTimeMillis();
        System.out.println(String.format("time elapsed: %d ms", t2 - t1));
    }

    private void printToConsole(List<Object> results) {

        for (Object result : results) {
            System.out.println(result);
        }
    }
}