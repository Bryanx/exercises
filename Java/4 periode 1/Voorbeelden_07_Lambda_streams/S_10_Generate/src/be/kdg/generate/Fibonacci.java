package be.kdg.generate;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FibonacciMaker implements Supplier<Long> {
    private long vorige = 0;
    private long huidige = 1;

    @Override
    public Long get() {
        long  volgende = huidige + vorige;
        vorige = huidige;
        huidige = volgende;
        return vorige;
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        Stream<Long> fibonacciStream = Stream.generate(new FibonacciMaker());
        List<Long> fibonacciGetallen = fibonacciStream.limit(25).collect(Collectors.toList());
        fibonacciGetallen.forEach(System.out::println);
    }
}

/*
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
1597
2584
4181
6765
10946
17711
28657
46368
75025
 */