// function inverted(n):
//     for i = 1 to n:
        
//         // print spaces
//         for j = 1 to (n - i):
//             print " " without newline

//         // print stars
//         for k = 1 to i:
//             print "*" without newline

//         move to next line

public class InvertedAndRotatedhalfPyramid {
    public static void inverted(int n) {
        for (int i = 1; i<=n ; i++){
            // space
            for (int j = 1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            
            // star
            for (int k = 1; k<=i; k++){
                System.out.print("*");
            }

            System.out.println();

        }
        
    }   
    public static void main(String[] args) {
        inverted(5);
    } 
}
