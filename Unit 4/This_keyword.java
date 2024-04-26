class student
{
    int id, age;
    String name;
    student()
    {
        id=123;
        name="ABC";
    }
    student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    student(int id, String name,int age)
    {
        this(id ,name); // Already Called Before So No Need to Assign Again 
        this.age = age;
    }
    public void display()
    {
        System.out.println("Student_ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class This_keyword
{
    public static void main(String[] args) 
    {
        student s1=new student(93,"Ansh");
        student s2=new student(97,"Meet",19);
        s1.display();
        s2.display();        
    }
    
}
