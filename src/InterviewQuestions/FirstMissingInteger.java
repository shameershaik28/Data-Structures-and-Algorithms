package InterviewQuestions;

public class FirstMissingInteger {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Replace irrelevant numbers
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Mark the presence of numbers
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // Step 3: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        FirstMissingInteger solution = new FirstMissingInteger();
        int[] nums = {3, 4, -1, 1};  // Example input
        int result = solution.firstMissingPositive(nums);
        System.out.println("The first missing positive integer is: " + result);
    }
}

