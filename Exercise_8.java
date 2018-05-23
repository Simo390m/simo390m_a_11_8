import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise_8
{

    public int minLength (Set<String> stringSet)
    {
        List<String> tempList = new ArrayList<>();
        tempList.addAll(stringSet);
        String shortest = tempList.get(0);

        if (!tempList.isEmpty())
        {
            for ( String element : tempList )
            {
                if (element.length() < shortest.length())
                {
                    shortest = element;
                }

            }

        }
        else
        {
            return 0;
        }

        return shortest.length();

    }


    public static void main(String[] args)
    {
        Exercise_8 exercise_8 = new Exercise_8();
        Set<String> stringSet  = new HashSet<>();

        stringSet.add("Aske");
        stringSet.add("Simon");
        stringSet.add("Jackie");
        stringSet.add("Mathias");
        stringSet.add("Sebastian");
        stringSet.add("Lasse");
        stringSet.add("asdjsadgk");
        stringSet.add("igjassad");
        stringSet.add("Aske");

        System.out.println(exercise_8.minLength(stringSet));



    }
}
