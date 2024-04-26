import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Person implements Comparable<Person>
{
    int age;
    String name;
    Person(int age, String name)
    {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person o)
    {
        if (this.age==o.age) 
        {
            return 0;        
        }
        else if (this.age>o.age) 
        {
            return 1;        
        }
        else
        {
            return -1;
        }
    }
}
public class TestPerson 
{
    public static void main(String[] args) 
    {
        Person p1 = new Person(10, "AB");
        Person p2 = new Person(20, "CD");
        Person p3 = new Person(30, "EF");
        Person p4 = new Person(50, "GH");
        Person p5 = new Person(5, "IJ");
        ArrayList<Person> a1 = new ArrayList<>();
        a1.add(p1);
        a1.add(p2);
        a1.add(p3);
        a1.add(p4);
        a1.add(p5);
        Collections.sort(a1);
        for(Person p:a1)
        {
            System.out.println(p.name+" "+p.age);
        }
    }
    
}
