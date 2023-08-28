import java.io.*;
 class LoadDataToEmp implements Serializable{
    private String name;
    private String address;
    private float salary;
    public LoadDataToEmp(String name,String address,float salary){
        this.name=name;
        this.address=address;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public float getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        LoadDataToEmp[] objects = new LoadDataToEmp[30];
        // String names[]=new String[30];
        String[] names = {
            "Alice", "Bob", "Charlie", "David", "Emma",
            "Fiona", "George", "Hannah", "Isaac", "Julia",
            "Kevin", "Laura", "Michael", "Nora", "Oliver",
            "Pamela", "Quincy", "Rachel", "Samuel", "Tara",
            "Ulysses", "Victoria", "William", "Xander", "Yara",
            "Zachary", "Ava", "Benjamin", "Chloe", "Daniel"
        };
        // String addresses[]=new String[30];
        String[] addresses = {
            "Pokhara", "Kathmandu", "Palpa", "Syangja", "Kathmandu",
            "Pokhara", "Palpa", "Syangja", "Kathmandu", "Pokhara",
            "Palpa", "Kathmandu", "Syangja", "Pokhara", "Palpa",
            "Syangja", "Kathmandu", "Pokhara", "Palpa", "Kathmandu",
            "Syangja", "Palpa", "Pokhara", "Kathmandu", "Syangja",
            "Palpa", "Kathmandu", "Pokhara", "Syangja", "Palpa"
        };
        // float salaries[]=new float[30];
        float[] salaries = {
            50000, 55000, 60000, 62000, 57000,
            59000, 63000, 52000, 58000, 61000,
            54000, 57000, 61000, 59000, 55000,
            53000, 57000, 61000, 56000, 59000,
            60000, 57000, 62000, 59000, 58000,
            60000, 56000, 59000, 58000, 57000
        };
            //writing the data in file
        try{
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.txt"));
            for (int i = 0; i < 30; i++) {
            objects[i] = new LoadDataToEmp(names[i],addresses[i],salaries[i]); 
                out.writeObject(objects[i]);
            }
                out.close();
            } catch(Exception e){
                e.printStackTrace();
            }
    }
}