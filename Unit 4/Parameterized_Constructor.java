class student
{
    int id;
    String name;
    student()
    {
        id=123;
        name="ABC";
    }
    student(int id, String name)
    {
        id = id;
        name = name;
    }
    public void display()
    {
        System.out.println("Student_ID: "+id);
        System.out.println("Student Name: "+name);
    }
}
public class Parameterized_Constructor
{
    public static void main(String[] args) 
    {
        student s1=new student(93,"Ansh");
        student s2=new student();
        s1.display();
        s2.display();        
    }
    
}
