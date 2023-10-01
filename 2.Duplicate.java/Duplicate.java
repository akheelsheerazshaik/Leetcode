import java.util.Arrays;

class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;
        
    }public static void main(String[] args) {
    int[] nums = {1, 2, 3, 1};
    Duplicate duplicate = new Duplicate();
    boolean result = duplicate.containsDuplicate(nums);
    System.out.println("Contains duplicate: " + result);
}

}