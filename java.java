import java.util.Scanner;
 
public class java {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s !", name);
        in.close();
    }
}