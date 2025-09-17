public class invertedStar {
    public static void main (String args[]){
        for (int line = 1; line <=5 ; line++){
            for (int space = 1; space < line; space++){
                System.out.print(" ");
            }
            for (int star = 1; star <= 6-line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}