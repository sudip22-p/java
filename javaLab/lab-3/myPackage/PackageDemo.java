package myPackage;
public class PackageDemo {
    public static void main(String[] args) {
        System.out.println("Using <Animal> class in myPackage");
        Animal cat=new Animal();
        System.out.println(cat.eat("Milk"));
        cat.makeSound("mew");
        System.out.println("\nUsing <Food> class in myPackage\n");
        Foods apple=new Foods();
        apple.show();
        apple.setFoodID(2000, "Apple");
    }
}
