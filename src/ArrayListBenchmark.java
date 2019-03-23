import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListBenchmark extends Benchmark {

    public ArrayList<Pair> arrayList = new ArrayList<Pair>();

    public void Fill(FileInputStream inputStream) {
        Scanner sc = new Scanner(inputStream, "UTF-8");

        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() < 3)
                continue;
            int index = containsWordAndGetIndex(word);
            if (index != -1)
                arrayList.get(index).countRepetition += 1;
            else
                arrayList.add(new Pair(word, 1));
        }
    }

    public int containsWordAndGetIndex(String word)
    {
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (arrayList.get(i).word.equals(word))
                return i;
        }
        return -1;
    }

    public void searchByPrefix(String prefix)
    {
        if (prefix.length() < 3)
        {
            System.out.println("Введите минимум 3 буквы");
            return;
        }
        ArrayList<Pair> sortedResult = new ArrayList<>();
        for (Pair p: arrayList)
            if (p.word.startsWith(prefix))
                sortedResult.add(p);
        sortedResult.sort(new SortPair());

        for (Pair p: sortedResult)
            System.out.println(p);
    }
}
