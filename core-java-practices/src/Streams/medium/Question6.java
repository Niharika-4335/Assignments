package Streams.medium;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
        Map<Integer, Long> frequencyMap = numbers.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        long minFrequency = frequencyMap.values().stream().mapToLong(Long::longValue).min().orElse(0);
        List<Integer> list= frequencyMap.entrySet().stream().filter
                (i->i.getValue()==minFrequency).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(list);
    }
}
