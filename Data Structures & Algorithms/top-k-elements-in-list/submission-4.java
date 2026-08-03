

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;

        int[] values = new int[n];
        int[] freq = new int[n];
        int m = 0;

        // Count frequency of each distinct element
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                values[m] = nums[i - 1];
                freq[m] = count;
                m++;
                count = 1;
            }
        }

        values[m] = nums[n - 1];
        freq[m] = count;
        m++;

        // Sort by frequency (descending)
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (freq[j] > freq[i]) {
                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = values[i];
        }

        return ans;
    }
}