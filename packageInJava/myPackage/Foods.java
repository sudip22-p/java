/* File name : myPackage/Foods. java */
package myPackage;
import java. util. Scanner;
public class Foods {
protected String foodName;
protected int foodID;
public void show()
{
System.out.println("Show method in Food Class");
}
public int getFoodID()
{
int id;
try (Scanner b = new Scanner (System. in)) {
    System.out.print ("Enter id: ");
    id = Integer.parseInt ( b. nextLine() );
return (id);
} catch (NumberFormatException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    return 0;
}
}
public String getFoodName(){
String name;
try (Scanner b = new Scanner (System.in)) {
    System. out .print ("Enter Food •Name: ");
    name=b.nextLine();
}
return (name);
}
public void setFoodID(int fID, String fName) {
this. foodName = fName;
this. foodID = fID;
System.out.println(this.foodID +":" +this.foodName);
}
}