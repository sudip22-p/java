package myPackage;
import java.util.Scanner;
public class Foods {
    protected String foodName;
    protected int foodID;
    public void show(){
        System.out.println("Show method in food class");
    }
    public int getFoodID(){
        int id;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter id:");
        id=Integer.parseInt(input.nextLine());
        return(id);
    }
    public String getFoodName(){
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter food name:");
        name=input.nextLine();
        return(name);
    }
    public void setFoodID(int fID,String fName){
        this.foodName=fName;
        this.foodID=fID;
        System.out.println(this.foodID+" : "+this.foodName);
    }
}
