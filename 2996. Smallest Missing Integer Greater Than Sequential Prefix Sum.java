class Solution {
    public static int missingInteger(int[] nums) {
        int firstNum = nums[0];
        int total=firstNum;
        
        for (int i = 1; i < nums.length; i++) {
            if (++firstNum == nums[i]) {
                total+=firstNum;
            } else {
                break;
            }
        }
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(total)) total++;
        
        return total;
    }
}