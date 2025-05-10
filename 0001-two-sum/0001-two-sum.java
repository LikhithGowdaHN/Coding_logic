class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[][] indexed= new int[n][2];

        for(int i=0;i<n;i++){
            indexed[i][0]=nums[i];
            indexed[i][1]=i;
        }
        Arrays.sort(indexed, (a,b)-> Integer.compare(a[0],b[0]));

        int start=0;
        int end=n-1;
        while(start<end){
            int sum=indexed[start][0]+indexed[end][0];
        if(sum==target){
            return new int[] {indexed[start][1], indexed[end][1]};
        }else if(sum>target){
            end--;
        }else{
            start++;
        }

        }
        return new int[] {};

    }
}