import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {
        String rawData = null;
        int intVal = 0;
        System.out.print("Please input an integer: ");
        try {
            // create an object of BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            rawData = br.readLine();
            intVal = Integer.parseInt(rawData);
        } catch (NumberFormatException ex) {
            System.err.println("Not a valid number:" + rawData);
        } catch (IOException e) {
            System.err.println("Unexpected I0 ERROR:" + e);
            System.out.println("Evaluated Integer value:" + intVal);
        }
    }
}
//Please input an integer: 65