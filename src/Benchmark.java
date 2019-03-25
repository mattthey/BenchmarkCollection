import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.stream.LongStream;

public abstract class Benchmark {
    public abstract void fill(FileInputStream inputStream);
    public abstract void searchByPrefix(String prefix);

    public long doBenchmarkFill(String path) throws Exception {

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
        } catch (FileNotFoundException ex) {
            throw new Exception("Файл не найден");
        }

        long[] results = new long[100];
        for (int i = 0; i < 100; i++)
        {
            long start = System.currentTimeMillis();
            fill(inputStream);
            long finish = System.currentTimeMillis();
            results[i] = finish - start;
        }
        return (LongStream.of(results).sum());
    }

    public long doBenchmarkSearchByPrefix(String prefix)
    {
        long[] results = new long[100];
        for (int i = 0; i < 100; i++)
        {
            long start = System.currentTimeMillis();
            searchByPrefix(prefix);
            long finish = System.currentTimeMillis();
            results[i] = finish - start;
        }
        return (LongStream.of(results).sum());
    }
}
