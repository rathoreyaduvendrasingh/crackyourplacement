import java.io.*;
import java.util.*;


public class ThreeSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(threeSum(arr));
    }
    static boolean isPresent(int[] nums, int i, int j, int k){
        int low = i, high = j;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == k) return true;
            else if(nums[mid] > k) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        int i = 0;
        int j = n - 1;
        while(i < j){
            int find = -(nums[i] + nums[j]);
            if(find > nums[j]){
                while(++i < n && nums[i] == nums[i-1]);
                j = n-1;
                if(nums[i] > 0 || nums[j] < 0 ) break;
            }else{
                if(isPresent(nums, i+1, j-1, find)){
                    List<Integer> r = new ArrayList<Integer>();
                    r.add(nums[i]);
                    r.add(nums[j]);
                    r.add(find);
                    res.add(r);
                }
                while(--j >= 0 && nums[j] == nums[j+1] );
            }
        }
        return res;
    }
}
