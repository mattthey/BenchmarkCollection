import java.util.Comparator;

public class SortPair implements Comparator<Pair>
{
    public int compare(Pair a, Pair b)
    {
        if (a.countRepetition == b.countRepetition)
            return a.word.compareTo(b.word);
        return a.countRepetition - b.countRepetition;
    }
}