public class Dimond {
    public static void dimond(int n) {
        // upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half (fixed)
        for (int i = n - 1; i >= 1; i--) { // start from n-1, go down to 1
            // spaces
            for (int j = n; j >= i; j--) { // print (n - i + 1) spaces
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dimond(4);
    }
}
