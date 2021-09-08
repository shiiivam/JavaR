import java.util.*;
class Sorts{
    public void mergeSort(int[] arr,int l,int r){
        
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
        
    }
    
    public void merge(int[] arr, int l, int mid, int r){
        int i = l;
        int j = mid+1;
        int k = l;
        int[] b = new int[r+1];
         
        while(i<=mid && j<=r){
            if(arr[i] < arr[j]){
                b[k] = arr[i];
                i++;
            }else{
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                b[k] = arr[j];
                k++;j++;
            }
        }else{
            while(i<=mid){
                b[k] = arr[i];
                k++; i++;
            }
        }
        for(k=l;k<=r;k++){
            arr[k] = b[k];
        }
        for(k=l;k<=r;k++){
            System.out.println(arr[k]);
        }
        
    }
}

public class MergeSort
{   
	public static void main(String[] args) {
        int[] arr = { 34,35,121,4,234,11,43};
        int l = 0;
        int r = 6;
        
        Sorts obj = new Sorts();
        obj.mergeSort(arr, l, r);     
	}
}
