import java.io.FileInputStream;
import java.util.stream.LongStream;

public abstract class Benchmark {
    public abstract void Fill(FileInputStream inputStream);
    public abstract void searchByPrefix(String prefix);

    public long doBenchmarkFill(FileInputStream inputStream)
    {
        long[] results = new long[100];
        for (int i = 0; i < 100; i++)
        {
            long start = System.currentTimeMillis();
            Fill(inputStream);
            long finish = System.currentTimeMillis();
            results[i] = finish - start;
        }
        return (LongStream.of(results).sum());
    }

    public long doBenchmarkSearchByPrefix(String prefix)
    {
        long start = System.currentTimeMillis();
        searchByPrefix(prefix);
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
