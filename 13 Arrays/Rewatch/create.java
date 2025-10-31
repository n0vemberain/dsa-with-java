
import java.util.*;

public class create {
    public static void main(String[] args) {
        int marks [] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks [0] = sc.nextInt(); //phy
        marks [1] = sc.nextInt(); //chem
        marks [2] = sc.nextInt(); //math

        System.out.println("Phy marks: " +marks[0]);
        System.out.println("Chem marks: " +marks[0]);
        System.out.println("Math marks: " +marks[0]);

        marks [2] = 100;
        System.out.println("Updated Math marks: " +marks[2]);
        System.out.println("Length of marks array: " +marks.length);

    }
}
