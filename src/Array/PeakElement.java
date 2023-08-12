
package Array;

import java.util.ArrayList;

public class PeakElement {
    
    public static ArrayList<Integer> peakElement(int []array){
        ArrayList<Integer> list=new ArrayList<>();
        int length=array.length;
        
        for(int i=0;i<length;i++){
            if(i==0){
                if(array[i]>array[i+1]){
                    list.add(array[i]);
                }
                continue;
            }
            if(i==length-1){
                if(array[i]>array[i-1]){
                    list.add(array[i]);
                }
                continue;
            }
            if(array[i]>array[i+1] && array[i]>array[i-1]){
                list.add(array[i]);
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        int []a={10, 20, 15, 2, 23, 90, 67};
        
       ArrayList<Integer> result=peakElement(a);
       for(int e:result){
           System.out.println(e);
       }
        
    }
}
