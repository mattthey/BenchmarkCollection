import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static String[] paths = { "./texts/text11(4729).txt", "./texts/text10(10351).txt", "./texts/text9(20065).txt",
            "./texts/text8(30927).txt", "./texts/text7(41402).txt", "./texts/text6(59935).txt",
            "./texts/text5(50514).txt", "./texts/text4(69803).txt", "./texts/text3(80018).txt",
            "./texts/text2(90430).txt", "./texts/text1(109497).txt" };


    public static void main(String[] args) {
        doBenchmarkArrayList();
    }

     private static void doWork(String path) {
        Scanner sc = new Scanner(System.in);
//        LinkedListBenchmark linkedListBenchmark = new LinkedListBenchmark();
//        linkedListBenchmark.fill(getFileInputStream(paths[10]));

//        TreeSetBenchmark treeSetBenchmark = new TreeSetBenchmark();
//        treeSetBenchmark.fill(getFileInputStream(paths[10]));

//        HashMapBenchmark hashMapBenchmark = new HashMapBenchmark();
//        hashMapBenchmark.fill(getFileInputStream(paths[10]));

         ArrayListBenchmark arrayListBenchmark = new ArrayListBenchmark();
         arrayListBenchmark.fill(getFileInputStream(path));

         while (true) {
             System.out.println("Введите слово");
             String word = sc.next();
             if (word.equals("!stop"))
                 break;
//             linkedListBenchmark.searchByPrefix(word, true);
//             treeSetBenchmark.searchByPrefix(word, true);
//             hashMapBenchmark.searchByPrefix(word, true);
             arrayListBenchmark.searchByPrefix(word, true);
             System.out.println("----------------------------------------");
             System.out.println();
         }
     }

    private static void doBenchmarkLinkedList() {
        for (String path: paths)
        {
            LinkedListBenchmark linkedListBenchmark = new LinkedListBenchmark();
            System.out.println("--------------------  " +path + "  --------------------");
            System.out.println(linkedListBenchmark.doBenchmarkFill(path));
            System.out.println("Бэнчмарк для поиска по слову");
            System.out.println("для linkedList " + linkedListBenchmark.doBenchmarkSearchByPrefix("комедию"));
        }
    }

    private static void doBenchmarkTreeSet() {
        for (String path: paths)
        {
            TreeSetBenchmark treeSetBenchmark = new TreeSetBenchmark();
            System.out.println("--------------------  " +path + "  --------------------");
            System.out.println(treeSetBenchmark.doBenchmarkFill(path));
            System.out.println("Бэнчмарк для поиска по слову");
            System.out.println("для treeSet " + treeSetBenchmark.doBenchmarkSearchByPrefix("комедию"));
        }
    }

    private static void doBenchmarkHashMap() {
        for (String path: paths)
        {
            HashMapBenchmark hashMapBenchmark = new HashMapBenchmark();
            System.out.println("--------------------  " +path + "  --------------------");
            System.out.println(hashMapBenchmark.doBenchmarkFill(path));
            System.out.println("Бэнчмарк для поиска по слову");
            System.out.println("для hashMap " + hashMapBenchmark.doBenchmarkSearchByPrefix("комедию"));
        }
    }

    private static void doBenchmarkArrayList() {
        for (String path: paths)
        {
            ArrayListBenchmark arrayListBenchmark = new ArrayListBenchmark();
            System.out.println("--------------------  " +path + "  --------------------");
            System.out.println(arrayListBenchmark.doBenchmarkFill(path));
            System.out.println("Бэнчмарк для поиска по слову");
            System.out.println("для arrayList " + arrayListBenchmark.doBenchmarkSearchByPrefix("комедию"));
        }
    }

    private static FileInputStream getFileInputStream(String path) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
        } catch (FileNotFoundException ex) {
            return null;
        }
        return inputStream;
    }
}