
package prjinheritance4;

public class Module extends Students 
{
    private String strCourse="";
    public Module(String Name, String Surname, String Course)
    {
        super(Name, Surname);
        this.strCourse=Course;
    }
    @Override
     public String toString()
    {
        return super.toString()+" and the course is "+this.strCourse; //super.tostring calls to string for another class
    }
}
