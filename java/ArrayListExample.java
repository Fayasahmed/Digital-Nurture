import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names (type 'exit' to stop):");
        while (true) {
            String name = sc.nextLine();
            if ("exit".equalsIgnoreCase(name)) break;
            names.add(name);
        }
        System.out.println("Student Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}