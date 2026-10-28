import java.util.Arrays;

public class selection {

    public static void selectionSort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minposition = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minposition] > nums[j]) {
                    minposition = j;
                }
            }

            // Swap
            int temp = nums[minposition];
            nums[minposition] = nums[i];
            nums[i] = temp;
        }

    }

    public static void main(String[] args) {
        int nums[] = { 7, 4, 1, 5, 3 };
        selectionSort(nums);
        for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
        }
        System.out.println();
    }
}