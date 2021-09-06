public class SelectionSort
{
	public static void main(String[] args) {
		int arr[] = {2, 1, 4, 3, 5};
		int n = arr.length;
		for(int i=0; i<n-1; i++){
		  //  boolean sorted = true;
		    int minInd = i;
		    for(int j=i; j<n; j++ ){
		        if(arr[j] < arr[minInd]){
		            minInd = j;
		        }
		    }
		    int temp = arr[minInd];
		    arr[minInd] = arr[i];
		    arr[i] = temp;
		}
		
		for( int e:arr){
		    System.out.print(e+ " ");
		}
	}
}