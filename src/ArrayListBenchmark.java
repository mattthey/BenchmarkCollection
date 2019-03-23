import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBenchmark {

    public ArrayList<Pair> arrayList = new ArrayList<Pair>();

    public void FillList(String path) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
            return;
        }

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
}
