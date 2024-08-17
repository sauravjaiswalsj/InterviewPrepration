public class VotingAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int x = majorityElement(arr);
        System.out.println(x);
    }
    public static int majorityElement(int[] nums) {
        int el = 0, cnt = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                el = nums[i];
                cnt = 1;
            } else if (el == nums[i]) {
                ++cnt;
            } else {
                --cnt;
            }
        }
        cnt = 0;
        for (int i = 0; i < n; i++) {
            if (el == nums[i])
                cnt++;
        }

        if (cnt > n / 2)
            return el;
        return -1;
    }
}
