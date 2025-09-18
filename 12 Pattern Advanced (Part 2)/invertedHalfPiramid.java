public class invertedHalfPiramid {
    public static void inverted(int n) {
        for(int i = 1; i<=n+1 ; i++){
            for(int j = 1 ; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted(5);
    }
}
