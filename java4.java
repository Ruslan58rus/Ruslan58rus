import java.io.*;
 
public class java4 {
 
    public static void main(String[] args) {
        
        try(FileReader reader = new FileReader("C:\\Users\\user\\Desktop\\file.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
    } 
}
