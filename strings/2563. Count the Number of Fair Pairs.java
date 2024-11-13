class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
     
      Arrays.sort(nums);
      return countLess(nums, upper) - countLess(nums, lower - 1);
    }
  
    private long countLess(int[] nums, int sum) {
      long res = 0;
      for (int i = 0, j = nums.length - 1; i < j; ++i) {
        while (i < j && nums[i] + nums[j] > sum)
          --j;
        res += j - i;
      }
      return res;
    }
  }

// First, it sorts nums to use an efficient two-pointer approach. 
// The function countFairPairs then calculates pairs with sums up to upper and subtracts those with sums below lower, getting the count within [lower, upper].
// The helper function countLess uses two pointers to count pairs: for each element i, it finds the farthest element j to the right where nums[i] + nums[j] is within the target sum. 
// giving a total time complexity of 𝑂(𝑛log𝑛)