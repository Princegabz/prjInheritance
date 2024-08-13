
package prjinheritance4;

public class PrjInheritance4 {

    public static void main(String[] args) 
    {
        Module m = new Module("Name","Surname","Course");
        System.out.println(m.toString());
        
        Students s = new Students("Name","Surname");
    }
}
