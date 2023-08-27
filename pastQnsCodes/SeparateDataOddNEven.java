import java.util.Scanner;
public class SeparateDataOddNEven{
    static void takeArray(int array[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the 10 elements:\n");
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        input.close();
    }
    static void displayArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array=new int[10];
        System.out.println("taking data..............");
        takeArray(array);
        //calculating the no of even elements.....
        int evenCount=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenCount++;
            }
        }
        //storing odd and even data......
        int[] evenData=new int[evenCount];
        int evenIndex=0;
        int[] oddData=new int[10-evenCount];
        int oddIndex=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenData[evenIndex]=array[i];
                evenIndex++;
            }
            else{
                oddData[oddIndex]=array[i];
                oddIndex++;
            }
            }
        // displayArray(array);
        System.out.println("odd data are:/n");
        displayArray(oddData);
        System.out.println("even data are:/n");
        displayArray(evenData);
    }
}
