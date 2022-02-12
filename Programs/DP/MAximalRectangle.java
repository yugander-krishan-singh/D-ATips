// Brute force Approach
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
      
      int[][] nums = new int[4][5];
      nums[0] = new int[] {1,0,1,0,0};
      nums[1] = new int[] {1,0,1,1,1};
      nums[2] = new int[] {1,1,1,1,1};
      nums[3] = new int[] {1,0,0,1,0};
      
      System.out.println(maxArea(nums));
    }
    
    public static int maxArea(int[][] nums) {
        int maxArea = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                if(nums[i][j] == 0) {
                    continue;
                }
                
                int l=nums[0].length;
                int b=nums.length;
                
                // i=0, j=2 => l=5, b=2
                // m=0 && m<2
                for(int m=i; m<b; m++) {
                    // n=2&&n<3
                    for(int n=j; n<l; n++) {
                        if(nums[m][n] == 0) {
                            l = n;
                            break;
                        }
                        maxArea = Math.max(maxArea, (m-i+1)*(n-j+1));
                    }
                }
                
                System.out.println("maxarea = " + maxArea + " when i = " + i + " and j = " + j);
            }
        }
        
        return maxArea;
    }
}
