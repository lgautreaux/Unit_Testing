public class Homework2 {
    public static int findSingle(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        // This is done because an array is always indexed at 0 so the length needs to be -1 

        while (left < right) {
            int mid = left + (right - left) / 2;
            //right-left is the length of the array ( ex. left is 0 and 7 is right this would mean 7 is the array length)
            //is used to find the midpoint of the array at all times

            // If mid is even, check the next element
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    left = mid + 2; // Unique element is on the right side
                } else {
                    right = mid; // Unique element is on the left side
                }
            } 
            // If mid is odd, check the previous element
            else {
                if (arr[mid] == arr[mid - 1]) {
                    left = mid + 1; // Unique element is on the right side
                } else {
                    right = mid - 1; // Unique element is on the left side
                }
            }
        }

        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 5, 5, 6, 6, 7, 8, 8, 9, 9};
        int result1 = findSingle(arr1);
        System.out.println("Single integer in arr1: " + result1); // Output: 7

        // Add more test cases to validate the solution
    }
}
