class Solution {
    public int maximumProduct(int[] nums) {
        
        //Need to compare 2 values: 
            //Case 1: If all values are positive, biggest value would be 3 last values in sorted array. 
            //Case 2: If there are negative values, compare case 1 to first 2 values in array * last one. 
        
        int[] sorted = sortArr(nums);
        int maxIndex = sorted.length-1;
        int count = 0;
        int maxProduct = 1;
        int maxNegProduct = 1;
        
        while(count < 3) {
            maxProduct = maxProduct * sorted[maxIndex];
            maxIndex--;
            count++;
        }
        
        maxNegProduct = sorted[0] * sorted[1] * sorted[sorted.length-1];
        
        if(maxNegProduct > maxProduct) maxProduct = maxNegProduct; 
        
        return maxProduct;
        
    }
    
    
    
    public int[] sortArr(int[] nums) {
        
        for(int i=0; i<nums.length-1; i++) {
            int minIndex = i; 
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        
        return nums;
        
    }
    
    
}