package be.kdg.iterate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateDemo {
    public static void main(String[] args) {

        List<Integer> machten = Stream.iterate(1, n -> n * 2)
                .limit(21)
                .collect(Collectors.toList());

        machten.forEach(System.out::println);
        System.out.println();

        Stream.iterate(3, n -> n + 2)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);
    }
}

/*
1
2
4
8
16
32
64
128
256
512
1024
2048
4096
8192
16384
32768
65536
131072
262144
524288
1048576

203
205
207
209
211
 */