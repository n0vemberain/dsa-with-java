// sorted array required
// Procedure BinarySearch(arr, target):
//     low ← 0
//     high ← length(arr) - 1
    
//     While low ≤ high:
//         mid ← (low + high) // 2   // integer division
        
//         If arr[mid] = target:
//             return mid   // target found at index mid
//         Else if arr[mid] < target:
//             low ← mid + 1   // search in right half
//         Else:
//             high ← mid - 1  // search in left half
    
//     return -1   // target not found


public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // return -1 if not found after loop
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 5, 6, 10, 14, 25}; // must be sorted for binary search
        int key = 10;
        int ans = binarySearch(numbers, key);
        System.out.println("Indx : "+ ans + "th");
    }
}
