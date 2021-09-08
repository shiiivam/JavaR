import java.util.*;
public class EvenDigtNumbersInArray
{
	public static void main(String[] args) {
		int[] arr = {132,423,43,54,24,2,454};
		List<Integer> arr1 = new ArrayList();
		int count=0,n=0;
		for(int i=0;i<arr.length;i++){
		    n = arr[i];
		    while(n>0){
		        n=n/10;
		        count++;
		    }
		    if(count%2==0){
		        arr1.add(arr[i]);
		    }
		    count = 0;
		}
		for(int e:arr1){
		    System.out.println(e);
		}
	}
}
