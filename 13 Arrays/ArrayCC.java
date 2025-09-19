
import java.util.*;

public class ArrayCC{
    public static void main(String[] args) {
        int marks[] = new int [100];
        System.out.println("Length of marks array: " + marks.length);

        Scanner sc = new Scanner(System.in);
        // int phy = sc.nectInt();
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy marks: " + marks[0]);
        System.out.println("Chem marks: " + marks[1]);
        System.out.println("Math marks: " + marks[2]);

        marks[2] = marks[2] + 1;

        System.out.println("Updated Math marks: " + marks[2]);


        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers[5]);
        sc.close();
    }
}
