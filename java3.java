import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Где ищем: ");
    String word8 = sc.nextLine();
    System.out.print("Что ищем: ");
    String word9 = sc.nextLine();
    int index = word8.indexOf(word9);
    sc.close();
    int occurrences = 0;
    while (index != -1) {
        occurrences++;
        word8 = word8.substring(index + 1);
        index = word8.indexOf(word9);
    }
    System.out.println("Строка " + word9 + " встречается " + occurrences + " раз");
}
}
