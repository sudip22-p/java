import java.lang.reflect.*;
public class ReflectionDemo{
    public static void main(String[] args) {
        try{
            Class c=Class.forName("java.util.Stack");
            Method methods[]=c.getDeclaredMethods();
            for(int i=0;i<methods.length;i++){
                System.out.println(methods[i].toString()+"\n");
            }
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
/*
 * public boolean java.util.Stack.empty()

public synchronized java.lang.Object java.util.Stack.peek()

public synchronized int java.util.Stack.search(java.lang.Object)

public java.lang.Object java.util.Stack.push(java.lang.Object)        

public synchronized java.lang.Object java.util.Stack.pop()
 */