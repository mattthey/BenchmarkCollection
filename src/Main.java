import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("./text.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
            return;
        }

        ArrayListBenchmark benchmarkList = new ArrayListBenchmark();
        benchmarkList.FillList(inputStream);
        int i = benchmarkList.containsWordAndGetIndex("прием");
        System.out.println(benchmarkList.arrayList.get(i).countRepetition);
    }
}