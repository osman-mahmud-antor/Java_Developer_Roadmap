import java.util.* ;
import java.io.*; 
public class Solution {
	public static void selectionSort(int arr[], int n) {
		// Write your code here.
		for(int i=0;i<=n-2;++i){
			int min_index = i;
			for(int j=i;j<=n-1;++j){
				if(arr[j]<arr[min_index]){
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
}
