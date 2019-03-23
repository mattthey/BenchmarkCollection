import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.AbstractList;
import java.util.List;
import java.util.ArrayList;

public abstract class Benchmark {

    private List<Pair> collection = null;

    public Benchmark(Class<? extends List> classCollection) {
        try {
            this.collection = classCollection.newInstance();
        } catch (Exception ex)  {
            System.out.println("Ошибка в создании класса: " + ex.toString());
        }
    }

    public void writeList(String path) {
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
            System.out.println(word);
        }
    }
}
