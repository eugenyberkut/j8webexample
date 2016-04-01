package server;

import java.util.*;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Eugeny on 01.04.2016.
 */
public class Calculator {
    List<String> lines = new ArrayList<>(Arrays.asList("Ivanov", "Sidorov", "Li", "Zed", "Petrov", "Perehodnik"));
    public void run() {
//        simpleSort();
//        sortReversed();
        sortByLength();
    }


    private void sortByLength() {
        Collections.sort(lines, Comparator.comparingInt(String::length));
    }

//    private void sortByLength() {
//        Collections.sort(lines, Comparator.comparingInt(s->s.length()));
//    }

//    private void sortByLength() {
//        Collections.sort(lines, Comparator.comparingInt((String s)->{return s.length();}));
//    }

//    private void sortByLength() {
//        Collections.sort(lines, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });
//    }

//    private void sortReversed() {
//        Arrays.sort(lines, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//    }


    private void sortReversed() {
        Collections.sort(lines, Comparator.reverseOrder());
    }

    private void simpleSort() {
        Collections.sort(lines);
    }

    public List<String> getLines() {
        return lines;
    }

    public List<String> findLongerThen(int limit) {
        return lines.stream()
                .filter(s -> s.length()>limit)
//                .filter(s -> s.startsWith("I"))
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(toList());
    }

    public List<Integer> fillLens(List<String> lines) {
        return lines.stream()
                .map(String::length)
                .collect(toList());
    }

    public int sumLen(List<String> lines) {
        return lines.stream().mapToInt(String::length).sum();
    }


//    public List<String> findLongerThen(int limit) {
//        List<String> result = new ArrayList<>();
//        for (String line : lines) {
//            if (line.length()>limit) {
//                result.add(line);
//            }
//        }
//        return result;
//    }

    public double integral(double a, double b, int n, DoubleUnaryOperator f) {
        double h = (b-a)/n;
        return IntStream.range(0,n).mapToDouble(i->a+i*h).map(f).sum()*h;
    }

}
