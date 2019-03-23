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
            if (arrayList.contains(word))
            {
                int i = arrayList.indexOf(word);
                arrayList.get(i).countRepetition += 1;
            }
            else
            {
                arrayList.add(new Pair(word, 1));
            }
        }
    }
}
