import java.io.*;
 class ReadEmpData implements Serializable{
    public static void main(String[] args) {
        LoadDataToEmp[] objects = new LoadDataToEmp[30];
try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.txt"));
            for (int i = 0; i < 30; i++) {
                objects[i] =(LoadDataToEmp)in.readObject(); 
                String address=objects[i].getAddress();
                if(address.equals("Kathmandu")){
                    System.out.println("*******");
                    System.out.println(objects[i].getName());
                    System.out.println(address);
                    System.out.println(objects[i].getSalary());
                    System.out.println("*******");
                }
            }
                in.close();
        } catch(Exception e){
            e.printStackTrace();
        } 
    }
}   