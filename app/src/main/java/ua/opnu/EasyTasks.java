package ua.opnu;

import java.util.*;
import java.util.stream.*;

public class EasyTasks {

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    public static List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    public static List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .collect(Collectors.toList());
    }

    public static List<String> flatten(List<String> names) {
        return names.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());
    }
}
