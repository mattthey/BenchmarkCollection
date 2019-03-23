import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        FileInputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream("./text.txt");
//        } catch (FileNotFoundException ex) {
//            System.out.println("Файл не найден");
//            return;
//        }
//        ArrayListBenchmark benchmarkList = new ArrayListBenchmark();
//        benchmarkList.Fill(inputStream);
//        System.out.println();
        TreeSet<Pair> tree = new TreeSet<Pair>();
        tree.add(new Pair("zzz", 1));
        tree.add(new Pair("bbb", 2));
        tree.add(new Pair("aaa", 3));
        print(tree);
        tree.add(new Pair("abc", 2));
        print(tree);
        System.out.println(tree.contains(new Pair("zzz", 2)));
        System.out.println("-----------");
        play(tree, "zzz");
        print(tree);
    }

    public static void print(TreeSet<Pair> tree)
    {
        for (Pair p: tree)
            System.out.print(p + "     ");
        System.out.println();
    }

    public static void play(TreeSet<Pair> tree, String word) {
        Iterator iterator = tree.iterator();
        while (iterator.hasNext())
        {
            Pair p = (Pair) iterator.next();
            if (p.word.equals(word))
                iterator.remove();
        }
    }
}