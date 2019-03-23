import java.io.FileInputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetBenchmark extends Benchmark {
    public TreeSet<Pair> treeSet = new TreeSet<>();

    public void Fill(FileInputStream inputStream) {
        Scanner sc = new Scanner(inputStream, "UTF-8");
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() < 3)
                continue;
            if (treeSet.contains(word)) {
                int i = treeSet.
                treeSet.remove(word);

            }
            else
                hashMap.put(word, 1);
        }
    }

    public void searchByPrefix(String prefix) {

    }
}
