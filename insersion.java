public class insersion {

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;

            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }

            nums[prev + 1] = curr;
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 3, 4, 1, 2 };

        insertionSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}