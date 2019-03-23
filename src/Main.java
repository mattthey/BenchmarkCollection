import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        ArrayListBenchmark arrayListBenchmark = new ArrayListBenchmark();
        LinkedListBenchmark linkedListBenchmark = new LinkedListBenchmark();
        TreeSetBenchmark treeSetBenchmark = new TreeSetBenchmark();
        HashMapBenchmark hashMapBenchmark = new HashMapBenchmark();
        try
        {
            System.out.println(linkedListBenchmark.doBenchmarkFill("text2.txt"));
            System.out.println(treeSetBenchmark.doBenchmarkFill("text2.txt"));
            System.out.println(hashMapBenchmark.doBenchmarkFill("text2.txt"));
            System.out.println(arrayListBenchmark.doBenchmarkFill("text2.txt"));
        } catch (Exception ex) {
            System.out.println("error");
        }
//        System.out.println("для arrayList " + arrayListBenchmark.doBenchmarkSearchByPrefix("комедию"));
//        System.out.println("для linkedList " + linkedListBenchmark.doBenchmarkSearchByPrefix("комедию"));
//        System.out.println("для treeSet " + treeSetBenchmark.doBenchmarkSearchByPrefix("комедию"));
//        System.out.println("для hashMap " + hashMapBenchmark.doBenchmarkSearchByPrefix("комедию"));
    }
}