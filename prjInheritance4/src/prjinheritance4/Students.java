
package prjinheritance4;

public class Students
{
    private String strName="";
    private String strSurname="";
    public Students(String Name,String Surname)
    {
        this.strName=Name;
        this.strSurname=Surname;
    }    
    @Override
    public String toString()
    {
        return "Name is "+ strName+" and surname is "+strSurname;
    }
         
}
