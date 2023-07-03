interface HumanInterface{
    String type="Human";
    public void study(String qualification);
}
interface AnimalInterface{
    public void eat();
    public void travel();
}
interface PlantInterface{
    public void grow();
}
class PersonClass implements AnimalInterface,HumanInterface{
    public void eat(){
        System.out.println("Person eats");
    }
    public void grow(){
        System.out.println("plant grows ");
    }
    public void travel(){
        System.out.println("Person travels");
    }
    public void study(String qualification){
        System.out.println(type+" studying "+qualification);
    }
}
public class InterfaceDemo{
    public static void main(String[] args) {
        PersonClass m =new PersonClass();
        m.grow();
        m.eat();
        m.travel();
        m.study("Software Engineering");
    }
}