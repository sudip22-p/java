import java.io.*;
public class SerializeDemo{
public static void main(String[] args){
Student e = new Student();
e.name = "Tom Swayer";
e.address = "Pokhara, Nepal";
e.regNum = 123456;
e.number = 101;
try
{
FileOutputStream fileOut =
new FileOutputStream("Student.ser");
ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(e);
out.close();
fileOut.close ();
System.out.printf("Serialized data is saved as Student.ser \n");
}catch (IOException i){
i.printStackTrace ();
}
}
}