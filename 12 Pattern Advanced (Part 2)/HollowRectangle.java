// Sudo code 
// for i = 1 to rows:
//     for j = 1 to cols:
//         if i == 1 or i == rows or j == 1 or j == cols:
//             print "*"
//         else:
//             print " "
//     new line




public class HollowRectangle {

    public static void Hollow_Rectangle(int totRows , int totCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner loop
            for (int j = 1; j <= totCols; j++) {
                // boundary condition
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // move to the next line after finishing one row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Rectangle(10,10);
    }
}
