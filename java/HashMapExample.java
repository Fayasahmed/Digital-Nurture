import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID and name (type '0' to stop):");
        while (true) {
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            if (id == 0) break;
            String name = sc.nextLine();
            students.put(id, name);
        }
        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        System.out.println("Student Name: " + students.getOrDefault(searchId, "Not found"));
    }
}