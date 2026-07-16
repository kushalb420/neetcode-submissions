class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr1 = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(i != j)
                {
                    if(nums[i] + nums[j] == target)
                    {
                        arr1[0] = i;
                        arr1[1] = j;
                        break;
                    }
                }
            }

        }   
return arr1;


    }

}

