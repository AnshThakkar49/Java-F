class person
{
    String name = "ABC";
    person()
    {
        System.out.println("Person Constructor");
    }
    public void message()
    {
        System.out.println("Greetings!!");
    }
}
class student extends person
{
    student()
    {
        super(); //Super Constructor
        System.out.println("Student's Constructor");
    }
    public void PrintName()
    {
        super.message(); //Super Method
        System.out.println("Name: "+super.name);//Super Variable
    }
}
public class Stud 
{
    public static void main(String[] args) 
    {
        student s1 = new student();
        s1.PrintName();        
    }
}