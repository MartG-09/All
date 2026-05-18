import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            // Check if arr[i] already exists in temp
            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                temp[size++] = arr[i];
            }
        }

        // Copy only the unique elements into a new array
        return Arrays.copyOf(temp, size);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 5};
        int[] uniqueArr = removeDuplicates(arr);

        System.out.println(Arrays.toString(uniqueArr));
        // Output: [1, 2, 3, 4, 5]
    }
}

