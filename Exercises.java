import java.util.HashSet;

public class Exercises
{
    private HashSet<String> set = new HashSet<String>();

    public Exercises()
    {
        set.add("Matt");
        System.out.println(set);
    }

    public void exercise1(HashSet<String> set, String element)
    {
        System.out.println("1st exercise: Write a Java program to append the specified element to the end of a hash set");
        set.add(element);
        System.out.println(set);
        System.out.println();
    }

    public void exercise2(HashSet<String> set)
    {
        System.out.println("2nd exercise: Write a Java program to iterate through all elements in a hash list");
        System.out.println(set);
        System.out.println();
    }

    public void exercise3(HashSet<String> set)
    {
        System.out.println("3rd exercise: Write a Java program to get the number of elements in a hash set");
        System.out.println("The number of elements in the list is: " + set.size());
        System.out.println();
    }

    public HashSet<String> getSet()
    {
        return set;
    }
}