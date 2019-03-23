import java.io.FileInputStream;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;

public class TreeSetBenchmark extends Benchmark {
    public TreeSet<Pair> treeSet = new TreeSet<>();
    public void fill(FileInputStream inputStream) {
        Scanner sc = new Scanner(inputStream, "UTF-8");
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() < 3)
                continue;
            updateOrAdd(word);
        }
    }

    public void updateOrAdd(String word) {
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            Pair p = (Pair)iterator.next();
            if (p.word.equals(word))
            {
                iterator.remove();
                p.countRepetition += 1;
                treeSet.add(p);
                return;
            }
        }
        treeSet.add(new Pair(word, 1));
    }

    public void searchByPrefix(String prefix) {
        if (prefix.length() < 3)
        {
            System.out.println("Введите минимум 3 буквы");
            return;
        }
//        ArrayList<Pair> sortedResult = new ArrayList<>();
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            Pair p = (Pair)iterator.next();
            if (p.word.startsWith(prefix))
                System.out.println(p);
        }
    }
}
