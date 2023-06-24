abstract class Maps{
    abstract void show();
    abstract void specifyPlace(String name);
}
class WebMaps extends Maps{
    void show(){
        System.out.println("Web Maps:Bing Map,Google Maps");
    }
    void specifyPlace(String name){
        System.out.println("Location: " + name);
    }
}
public class AbstractClassDemo{
    public static void main(String[] args) {
        WebMaps w=new WebMaps();
        w.show();
        w.specifyPlace("Pokhara");
    }
}