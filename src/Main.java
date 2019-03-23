import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayListBenchmark benchmarkList = new ArrayListBenchmark();
        benchmarkList.FillList("./warAndPeace.txt");
        System.out.println("finish");
    }
}