public class Main {

    public static void main(String[] args) {
//        LinkedListBenchmark linkedListBenchmark = new LinkedListBenchmark();
//        TreeSetBenchmark treeSetBenchmark = new TreeSetBenchmark();
//        HashMapBenchmark hashMapBenchmark = new HashMapBenchmark();
        ArrayListBenchmark arrayListBenchmark = new ArrayListBenchmark();

        String[] paths = { "./texts/text11(4729).txt", "./texts/text10(10351).txt", "./texts/text9(20065).txt",
                "./texts/text8(30927).txt", "./texts/text7(41402).txt", "./texts/text6(59935).txt",
                "./texts/text5(50514).txt", "./texts/text4(69803).txt", "./texts/text3(80018).txt",
                "./texts/text2(90430).txt", "./texts/text1(109497).txt" };

        for (String path: paths)
        {
            try
            {
                System.out.println("--------------------  " +path + "  --------------------");
//                System.out.println(linkedListBenchmark.doBenchmarkFill(path));
//                System.out.println(treeSetBenchmark.doBenchmarkFill(path));
//                System.out.println(hashMapBenchmark.doBenchmarkFill(path));
                System.out.println(arrayListBenchmark.doBenchmarkFill(path));

                System.out.println("Бэнчмарк для поиска по слову");
                System.out.println("для arrayList " + arrayListBenchmark.doBenchmarkSearchByPrefix("комедию"));
            } catch (Exception ex) {
                System.out.println("неправильный путь");
        }
        }
    }
}