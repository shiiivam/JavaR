public class OptimizedBubbleSort
{
	public static void main(String[] args) {
		int arr[] = {2, 1, 4, 3, 5};
		int n = arr.length;
		for(int i=0; i<n-1; i++){
		    boolean sorted = true;
		    
		    for(int j=0; j<n-1-i; j++ ){
		        if(arr[j+1] < arr[j]){
		            int temp = arr[j+1];
		            arr[j+1] = arr[j];
		            arr[j] = temp;
		            sorted = false;
		        }
		    }
		    if(sorted) break;
		}
		
		for( int e:arr){
		    System.out.print(e+ " ");
		}
	}
}
