class student
{
    String name;
    int S_id;
    student()
    {
        name = "ABC";
        S_id = 123;
    }
    public void display()
    {
        System.out.println("Name is: "+name);
        System.out.println("Student Id is: "+S_id);
    }
}
public class Sample 
{
    public static void main(String[] args) 
    {
        student s1=new student();
        student s2=new student();
        s1.name="Ansh";
        s1.S_id=93;
        s1.display();
        s2.display();        
    }
}