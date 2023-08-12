
package Array;

/**
 *  1) Approach 1 :Linear Search Comparison = 2*(n) or 1+2(n-1)
 *  2) Approach 2 :Comparing in Pair : N=Odd 1+3*(n-2)/2   N= EVEN 3*(N-2)/2
 * 
 */
public class MinimumAndMaximumWithMinimumCoparison {
    
    public static int [] PairApproach(int[]A){
        int[] min_max=new int[2];
        int n=A.length;
        int max,min;
        int i;
            
        if(n%2==0){
            if(A[0]>A[1]){
                max=A[0];
                min=A[1];
            }
            else{
                max=A[1];
                min=A[0];
            }
            i=2;
        }
        // N is Odd
        else{
            min=A[0];
            max=A[0];
            i=1;
        }
        
        while(i<n-1){
            if(A[i]>A[i+1]){
                if(A[i]>max){
                    max=A[i];
                }
                if(A[i]<min){
                    min=A[i];
                }
            }
            else{
                if(A[i+1]>max){
                    max=A[i+1];
                }
                if(A[i]<min){
                    min=A[i];
                }
            }
            i+=2;
        }
        
        min_max[0]=min;
        min_max[1]=max;
        return min_max;
    }
    
    public static int [] LinearApproach(int []A){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int []max_min = new int[2];
        for(int i=0;i<A.length;i++){
            if(A[i]<min) min=A[i];
            if(A[i]>max) max=A[i];
        }
        max_min[0]=min;
        max_min[1]=max;
        return max_min;
    }
    
    public static void main(String[] args) {
        int []a={3,5,4,1,9};
//        int[]res=LinearApproach(a);
          int[]res=PairApproach(a);
        for(int e:res){
        System.out.println(e);
        }
        
        
    }
}
