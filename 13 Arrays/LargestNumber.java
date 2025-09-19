public class LargestNumber {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // smallest value of integer
        int smallest = Integer.MAX_VALUE; // largest value of integer
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 5, 7, 9, 3, 6};
        int largest = getLargest(numbers);
        System.out.println("The largest number is : " + largest);
    }
}
