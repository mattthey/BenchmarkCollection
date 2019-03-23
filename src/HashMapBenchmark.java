import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapBenchmark extends Benchmark {

    public HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public void Fill(FileInputStream inputStream) {
        Scanner sc = new Scanner(inputStream, "UTF-8");
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() < 3)
                continue;
            if (hashMap.containsKey(word))
                hashMap.put(word, hashMap.get(word) + 1);
            else
                hashMap.put(word, 1);
        }
    }

    public void searchByPrefix(String prefix) {
        if (prefix.length() < 3)
        {
            System.out.println("Введите минимум 3 буквы");
            return;
        }
        ArrayList<Pair> sortedResult = new ArrayList<>();
        for (String key: hashMap.keySet())
            if (key.startsWith(prefix))
                sortedResult.add(new Pair(key, hashMap.get(key)));
        sortedResult.sort(new SortPair());

        for (Pair p: sortedResult)
            System.out.println(p);

    }
}
