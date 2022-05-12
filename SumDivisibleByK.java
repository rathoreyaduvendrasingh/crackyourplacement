import java.io.*;
import java.util.*;


public class SumDivisibleByK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        //System.out.println(subarraysDivByK(arr,k));
        System.out.println(-19%5);
    }
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0;
        int ans=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int no=sum%k;
            if(no<0){
                no+=k;
            }
            if(hm.containsKey(no)){
                ans+=hm.get(no);
                hm.put(no,hm.get(no)+1);
            }else{
                hm.put(no,1);
            }
        }
        return ans;
    }
}