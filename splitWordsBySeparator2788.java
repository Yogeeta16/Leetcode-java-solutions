import java.util.*;
import java.util.stream.Collectors;
public class splitWordsBySeparator2788 {
    public static void main(String[] args) {

    }
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
    return words.stream()
            .flatMap(word -> Arrays.stream(word.split("\\" + separator)))
            .filter(word -> !word.isEmpty())
            .collect(Collectors.toList());
}
}



